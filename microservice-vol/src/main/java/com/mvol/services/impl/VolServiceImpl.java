package com.mvol.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvol.entities.Vol;
import com.mvol.repositories.VolRepository;
import com.mvol.services.VolService;

@Service
public class VolServiceImpl implements VolService{
	
	@Autowired
	VolRepository volRepository;

	@Override
	public List<Vol> findAll() {
		return volRepository.findAll();
	}

	@Override
	public Vol findOne(Long id) {
		return volRepository.findById(id).get();
	}

	@Override
	public Vol save(Vol vol) {
		return volRepository.save(vol);
	}

	@Override
	public void delete(Long id) {
		volRepository.deleteById(id);
	}

}
