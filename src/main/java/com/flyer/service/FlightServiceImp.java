package com.flyer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyer.model.Flight;
import com.flyer.repository.FlightRepository;

@Service
public class FlightServiceImp implements FlightService {

	@Autowired
	FlightRepository repo;
	
	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Flight getFlightById(int id) {
		// TODO Auto-generated method stub
		Optional<Flight> flight = repo.findById(id);
		return flight.get();
	}
	
	@Override
	public Flight addFlight(Flight f) {
		// TODO Auto-generated method stub
		return repo.save(f);
	}

	@Override
	public Flight modifyFlight(Flight f) {
		// TODO Auto-generated method stub
		Optional<Flight> flight1 = repo.findById(f.getId());
		Flight flight = flight1.get();
		flight.setDepartureDate(f.getDepartureDate());
		flight.setArrivalDate(f.getArrivalDate());
		flight.setDepartureLocation(f.getDepartureLocation());
		flight.setArrivalLocation(f.getArrivalLocation());
		return repo.save(flight);
	}

	@Override
	public void deleteFlight(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}