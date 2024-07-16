package com.euphoticlab.dishes_management.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.euphoticlab.dishes_management.dto.Dishes;
import com.euphoticlab.dishes_management.repository.DishesRepository;
import com.euphoticlab.dishes_management.util.SaveData;

@Repository
public class DishesDao {
	@Autowired
	private DishesRepository repository ;
	
	public List<Dishes> findAllDishes() {
		List<Dishes> li = repository.findAll();
		if(li.isEmpty()) {
			repository.saveAll(SaveData.DishesDatas());
		}
		return repository.findAll();
	}
	
	public Dishes updateIsPublished(Dishes dishes) {
		
		return repository.save(dishes);
	}
	
	public Optional<Dishes> findById(int id) {
		return repository.findById(id);
	}
}
