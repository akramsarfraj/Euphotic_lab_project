package com.euphoticlab.dishes_management.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dishes {
	@Id
	private int dishId;
	private String dishName;
	private String imageUrl;
	private	boolean isPublished;
	
	
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isPublished() {
		return isPublished;
	}
	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}
	@Override
	public String toString() {
		return "Dishes [dishId=" + dishId + ", dishName=" + dishName + ", imageUrl=" + imageUrl + ", isPublished="
				+ isPublished + "]";
	}
	
	
}
