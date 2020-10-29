package com.javacourse.springBootDemo.DataAccess;

import java.util.List;
import com.javacourse.springBootDemo.Entities.*;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
