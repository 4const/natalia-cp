package ru.nstu.nd.dance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nstu.nd.dance.dao.CityDAO;
import ru.nstu.nd.dance.model.City;

import java.util.List;

@Service
public class CityService {

	@Autowired
	private CityDAO cityDAO;


	public List<City> getAll() {
		return cityDAO.findAll();
	}

	public City save(City city) {
		return cityDAO.save(city);
	}

	public void delete(City city) {
		cityDAO.delete(city);
	}
}
