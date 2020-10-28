package com.javacourse.springBootDemo.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.springBootDemo.DataAccess.ICityDal;
import com.javacourse.springBootDemo.Entities.City;

@Service
public class CityManager implements ICityService{
	
	private ICityDal citydal;

	@Autowired
	public CityManager(ICityDal citydal) {
		this.citydal = citydal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return this.citydal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
