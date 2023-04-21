package com.checkin.integration.dto;

public class Reservation {
	private Long id;
	private boolean checkedIn;
	private int NumberOfBags;
	private Passenger passenger;
	private Flight flight;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isCheckIn() {
		return checkedIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkedIn = checkIn;
	}
	public int getNumberOfBags() {
		return NumberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		NumberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	

}
