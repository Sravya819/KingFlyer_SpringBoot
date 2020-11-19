package com.flyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyer.model.Flight;
import com.flyer.service.FlightService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class FlightController {

	@Autowired
	FlightService service;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights(){
		return service.getAllFlights();
	}
	
	@GetMapping("/flights/{id}")
	public Flight getFlightById(@PathVariable int id){
		return service.getFlightById(id);
	}
	
	@PostMapping("/flights")
	public Flight addFlight(@RequestBody Flight f) {
		return service.addFlight(f);
	}
	
	@PutMapping("/flights")
	public Flight modifyFlight(@RequestBody Flight f) {
		return service.modifyFlight(f);
	}
	
	@GetMapping("/flights/afterDelete/{id}")
	public List<Flight> deleteFlight(@PathVariable int id){
		service.deleteFlight(id);
		return service.getAllFlights();
	}
	
}

