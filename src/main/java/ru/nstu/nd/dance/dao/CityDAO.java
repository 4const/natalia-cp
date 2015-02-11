package ru.nstu.nd.dance.dao;

import org.springframework.data.repository.Repository;
import ru.nstu.nd.dance.model.City;

import java.util.List;

public interface CityDAO extends Repository<City, Integer> {

	List<City> findAll();

	City save(City city);

	void delete(City city);
}
