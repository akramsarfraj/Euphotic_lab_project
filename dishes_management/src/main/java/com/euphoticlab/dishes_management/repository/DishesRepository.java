package com.euphoticlab.dishes_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.euphoticlab.dishes_management.dto.Dishes;

public interface DishesRepository  extends JpaRepository<Dishes, Integer> {

}
