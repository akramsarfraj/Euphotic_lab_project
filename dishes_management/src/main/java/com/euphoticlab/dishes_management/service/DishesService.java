package com.euphoticlab.dishes_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euphoticlab.dishes_management.dao.DishesDao;
import com.euphoticlab.dishes_management.dto.Dishes;

@Service
public class DishesService {
	@Autowired
	private  DishesDao dao;
	
	public List<Dishes> findAllDishes() {
		return dao.findAllDishes();
	}
	
	public Dishes findDishesById(int id) {
		Optional<Dishes> optional = dao.findById(id);
		Dishes dish = null;
		try {
		 dish= optional.get();
		}catch (Exception e) {
			System.out.println("No dish found");
		}
		return dish;
	}
	
	public String updatePublished(int id,String published) {
		Optional<Dishes> optional = dao.findById(id);
		if(optional.isPresent()) {
			Dishes db = optional.get();
		
			if(published.equals("publish")) {
				
				db.setPublished(true);
			}else {
				
				db.setPublished(false);
			}
			
			
			dao.updateIsPublished(db);
			
			return "Is Published updated";
		}
		return "Error in updating";
		
	}
	
}
