package com.mvol.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvol.entities.Vol;
import com.mvol.services.VolService;

@RestController
public class VolController {
	
	@Autowired
	VolService volService;
	
	@GetMapping("/vols")
	public List<Vol> findAll() {
		return volService.findAll();
	}

	@GetMapping("/vol/{id}")
	public Vol findOne(@PathParam("id") Long id) {
		return volService.findOne(id);
	}

	@PostMapping("/vol")
	public Vol save(@RequestBody Vol vol) {
		return volService.save(vol);
	}

	@DeleteMapping("/vol/{id}")
	public void delete(@PathParam("id") Long id) {
		volService.delete(id);
	}

}
