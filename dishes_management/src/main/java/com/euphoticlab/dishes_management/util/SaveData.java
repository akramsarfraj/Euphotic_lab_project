package com.euphoticlab.dishes_management.util;

import java.util.ArrayList;
import java.util.List;

import com.euphoticlab.dishes_management.dto.Dishes;

public class SaveData {

	public static List<Dishes> DishesDatas() {
		List<Dishes> dishes = new ArrayList<Dishes>();
		Dishes dishes1 = new Dishes();
		dishes1.setDishId(1);
		dishes1.setDishName("Jeera Rice");
		dishes1.setImageUrl("https://nosh-assignment.s3.ap-south-1.amazonaws.com/jeera-rice.jpg");
		dishes1.setPublished(true);
		
		Dishes dishes2 = new Dishes();
		dishes2.setDishId(2);
		dishes2.setDishName("Paneer Tikka");
		dishes2.setImageUrl("https://nosh-assignment.s3.ap-south-1.amazonaws.com/paneer-tikka.jpg");
		dishes2.setPublished(true);
		
		Dishes dishes3 = new Dishes();
		dishes3.setDishId(3);
		dishes3.setDishName("Rabdi");
		dishes3.setImageUrl("https://nosh-assignment.s3.ap-south-1.amazonaws.com/rabdi.jpg");
		dishes3.setPublished(true);
		
		Dishes dishes4 = new Dishes();
		dishes4.setDishId(4);
		dishes4.setDishName("Chicken Biryani");
		dishes4.setImageUrl("https://nosh-assignment.s3.ap-south-1.amazonaws.com/chicken-biryani.jpg");
		dishes4.setPublished(true);
		
		Dishes dishes5 = new Dishes();
		dishes5.setDishId(5);
		dishes5.setDishName("Alfredo Pasta");
		dishes5.setImageUrl("https://nosh-assignment.s3.ap-south-1.amazonaws.com/alfredo-pasta.jpg");
		dishes5.setPublished(true);

		dishes.add(dishes1);
		dishes.add(dishes2);
		dishes.add(dishes3);
		dishes.add(dishes4);
		dishes.add(dishes5);
		
		return dishes;
	}
}
