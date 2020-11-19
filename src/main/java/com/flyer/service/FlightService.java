package com.flyer.service;

import java.util.List;

import com.flyer.model.Flight;

public interface FlightService {
	
	public List<Flight> getAllFlights();

	public Flight getFlightById(int id);
	
	public Flight addFlight(Flight f);

	public Flight modifyFlight(Flight f);

	public void deleteFlight(int id);

}
