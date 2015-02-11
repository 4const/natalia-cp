package ru.nstu.nd.dance.dao;

import org.springframework.data.repository.Repository;
import ru.nstu.nd.dance.model.Contestant;

import java.util.List;

public interface ContestantDAO extends Repository<Contestant, Integer> {

	List<Contestant> findAll();

	Contestant save(Contestant contestant);

	void delete(Contestant contestant);
}
