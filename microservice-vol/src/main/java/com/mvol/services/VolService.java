package com.mvol.services;

import java.util.List;

import com.mvol.entities.Vol;

public interface VolService {
	
	List<Vol> findAll();
	
	Vol findOne(Long id);
	
	Vol save(Vol vol);
	
	void delete(Long id);

}
