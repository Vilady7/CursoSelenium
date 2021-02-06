package com.excersise;

public abstract class TicketsParks {
	String welcomeMessage;
	
	public TicketsParks() {
		this.welcomeMessage = "Welcome Cooltesters Park -";
	}
	
	public String welcomeMessageString() {
		return this.welcomeMessage;
	}
	
	// Abstraction
	public abstract double getTicketPrice();
	public abstract void printPriceDay();
	public abstract void printPriceDay(String keyManager, String priceDay);

}