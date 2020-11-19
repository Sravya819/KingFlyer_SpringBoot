package com.flyer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyer.model.Booking;
import com.flyer.repository.BookingRepository;

@Service
public class BookingServiceImp implements BookingService {

	@Autowired
	BookingRepository repo;
	
	@Override
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Booking getBookingById(int id) {
		// TODO Auto-generated method stub
		Optional<Booking> booking = repo.findById(id);
		return booking.get();
	}
	
	@Override
	public Booking addBooking(Booking b) {
		// TODO Auto-generated method stub
		return repo.save(b);
	}

	@Override
	public void cancelBooking(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
