package com.flyer.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Booking")
public class Booking {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "booking_number")
	int bookingNumber;
	@Column(name = "travel_date")
	Date travelDate;
	@Column(name = "departure_location")
	String departureLocation;
	@Column(name = "arrival_location")
	String arrivalLocation;
	@Column(name = "passenger_name")
	String passengerName;
	@Column(name = "gender")
	String gender;
	@Column(name = "class")
	String classType;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingNumber, Date travelDate, String departureLocation, String arrivalLocation,
			String passengerName, String gender, String classType) {
		super();
		this.bookingNumber = bookingNumber;
		this.travelDate = travelDate;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.passengerName = passengerName;
		this.gender = gender;
		this.classType = classType;
	}

	public int getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(int bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalLocation == null) ? 0 : arrivalLocation.hashCode());
		result = prime * result + bookingNumber;
		result = prime * result + ((classType == null) ? 0 : classType.hashCode());
		result = prime * result + ((departureLocation == null) ? 0 : departureLocation.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((passengerName == null) ? 0 : passengerName.hashCode());
		result = prime * result + ((travelDate == null) ? 0 : travelDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (arrivalLocation == null) {
			if (other.arrivalLocation != null)
				return false;
		} else if (!arrivalLocation.equals(other.arrivalLocation))
			return false;
		if (bookingNumber != other.bookingNumber)
			return false;
		if (classType == null) {
			if (other.classType != null)
				return false;
		} else if (!classType.equals(other.classType))
			return false;
		if (departureLocation == null) {
			if (other.departureLocation != null)
				return false;
		} else if (!departureLocation.equals(other.departureLocation))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (passengerName == null) {
			if (other.passengerName != null)
				return false;
		} else if (!passengerName.equals(other.passengerName))
			return false;
		if (travelDate == null) {
			if (other.travelDate != null)
				return false;
		} else if (!travelDate.equals(other.travelDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Booking [bookingNumber=" + bookingNumber + ", travelDate=" + travelDate + ", departureLocation="
				+ departureLocation + ", arrivalLocation=" + arrivalLocation + ", passengerName=" + passengerName
				+ ", gender=" + gender + ", classType=" + classType + "]";
	}
	
}
