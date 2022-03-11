package com.fritata.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fritata.models.Food;

public interface IFoodDao extends CrudRepository<Food, Long>{
	
	
	public List<Food> findByFoodName(String name);

}
