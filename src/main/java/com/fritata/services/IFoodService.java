package com.fritata.services;

import java.util.List;
import java.util.Optional;

import com.fritata.models.Food;


public interface IFoodService {
	
	public List<Food> findAll();
	
	public Optional<Food> findOne(Long id);

	public Optional<Food> findByFoodName(String name);
	
}
