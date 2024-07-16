package com.euphoticlab.dishes_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.euphoticlab.dishes_management.dto.Dishes;
import com.euphoticlab.dishes_management.service.DishesService;


@CrossOrigin
@RestController
@RequestMapping("/euphoticlab/dishes_api")
public class DishesController {
	
	@Autowired
	private  DishesService service;
	
	@GetMapping
	public List<Dishes> findAll() {
		return service.findAllDishes();
	}
	
	@GetMapping("{id}")
	public Dishes findDish(@PathVariable(name = "id")int id) {
		return service.findDishesById(id);
	}
	
	@PostMapping("/{id}")
	public String updatePublished(@PathVariable(name = "id") int id, @RequestParam(name = "setPublish") String published) {
		System.out.println(published);
		return service.updatePublished(id,published);
	}
}
