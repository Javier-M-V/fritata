package com.fritata.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fritata.dao.IFoodDao;
import com.fritata.models.Food;

@Service
public class FoodServiceImpl implements IFoodService {

	@Autowired
	private IFoodDao foodDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Food> findAll() {
	
		return (List<Food>) foodDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Food> findOne(Long id) {
		
		return foodDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Food> findByFoodName(String name) {
		
		return foodDao.findByFoodName(name).stream().findFirst();
	}
}
