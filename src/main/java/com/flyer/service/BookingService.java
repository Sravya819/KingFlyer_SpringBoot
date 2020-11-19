package com.flyer.service;

import java.util.List;

import com.flyer.model.Booking;

public interface BookingService {

	public List<Booking> getAllBookings();

	public Booking getBookingById(int id);

	public Booking addBooking(Booking b);

	public void cancelBooking(int id);
	
}
