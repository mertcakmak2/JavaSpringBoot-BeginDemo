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
		this.citydal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.citydal.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.citydal.delete(city);
	}

	@Override
	@Transactional
	public City getById(int id) {
		return this.citydal.getById(id);
	}

}
