package com.example.demo.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

	
}
