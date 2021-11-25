package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Bike;
import com.example.demo.repositiries.BikeRepository;

@RestController
@RequestMapping("api/v1/bikes")
public class BikeController {
	
	@Autowired
	private BikeRepository bikerepository;
	
	@GetMapping
	public List<Bike> list(){
		
		return bikerepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Bike create(@RequestBody Bike bike) {
		return bikerepository.save(bike);
	}

	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		return bikerepository.getOne(id);
	}
	
	
}
