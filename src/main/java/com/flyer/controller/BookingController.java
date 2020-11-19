package com.flyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyer.model.Booking;
import com.flyer.service.BookingService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {

	@Autowired
	BookingService service;
	
	@GetMapping("/bookings")
	public List<Booking> getAllBookings(){
		return service.getAllBookings();
	}
	
	@GetMapping("/bookings/{id}")
	public Booking getBookingById(@PathVariable int id){
		return service.getBookingById(id);
	}
	
	@PostMapping("/bookings")
	public Booking addBooking(@RequestBody Booking b) {
		return service.addBooking(b);
	}
	
	@GetMapping("/bookings/afterDelete/{id}")
	public List<Booking> cancelBooking(@PathVariable int id){
		service.cancelBooking(id);
		return service.getAllBookings();
	}
	
}
