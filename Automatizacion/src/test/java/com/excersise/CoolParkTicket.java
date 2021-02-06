package com.excersise;

public class CoolParkTicket extends TicketsParks{
	
	double adultTicket, childTicket, studentTicket;
	int age;
	boolean student = false;
	String priceDay, park;
	
	//Constructor
	public CoolParkTicket (double price, int personAge, boolean studentId) {
		super();
		age = personAge;
		student = studentId;
		adultTicket = price;
		childTicket = price * (.80);
		studentTicket = price * (.50);
		priceDay = "Normal Day Price";
		park = "Cool Park";
		
	}
	
	//Encapsulation
	//setter
	private void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}

	//getter
	private String getPriceDay(String priceDay) {
		return priceDay;
	}
	
	//METODO
	@Override
	public double getTicketPrice() {
		double priceTicket;
		if(student == true) {
			priceTicket = studentTicket;
			System.out.println("Student Price (50% applied): $"+studentTicket);
		}else if (age>=18) {
			priceTicket = adultTicket;
			System.out.println("Adult Price: $"+adultTicket);
		}else {
			priceTicket = childTicket;
			System.out.println("Child Price (20% applied): $"+childTicket);
		}
		return priceTicket;
		
	}
	
	@Override
	public void printPriceDay() {
		System.out.println(welcomeMessageString()  + " "+ getPriceDay(priceDay));
	}
	
	//Overloading
	@Override
	public void printPriceDay(String keyManager, String priceDay) {
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() + getPriceDay(priceDay));
	}


}
