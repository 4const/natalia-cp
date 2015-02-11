package ru.nstu.nd.dance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nstu.nd.dance.dao.ContestantDAO;
import ru.nstu.nd.dance.model.Contestant;

import java.util.List;

@Service
@Transactional
public class ContestantService {

	@Autowired
	private ContestantDAO contestantDAO;


	public List<Contestant> getAll() {
		return contestantDAO.findAll();
	}

	public Contestant save(Contestant contestant) {
		return contestantDAO.save(contestant);
	}

	public void delete(Contestant contestant) {
		contestantDAO.delete(contestant);
	}
}
