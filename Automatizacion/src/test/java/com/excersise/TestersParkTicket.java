package com.excersise;

public class TestersParkTicket extends TicketsParks {

	double adultTicket, childTicket, studentTicket;
	int age;
	boolean student = false;
	String priceDay, park;
	
	//Constructor
	public TestersParkTicket (double price, int personAge, boolean studentId) {
		super();
		age = personAge;
		student = studentId;
		adultTicket = price;
		childTicket = price * (.60);
		studentTicket = price * (.30);
		priceDay = "Normal Day Price";
		park = "Testers Park";
		
	}
	
	
	// Constructor (Overloading)
	public TestersParkTicket(double price, int personAge, boolean studentID, double discont) {
		super();
		adultTicket = price - discont;
		childTicket = price * (.60) - discont;
		studentTicket = price * (.30) - discont;
		age = personAge;
		student = studentID;
		priceDay = "Children's Day Price";
		park = "Testers Park - ";

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
//		if(student == true) {
//		priceTicket = studentTicket;
//		System.out.println("Student Price (50% applied): $"+studentTicket);
//	}else if (age>=18) {
//		priceTicket = adultTicket;
//		System.out.println("Adult Price: $"+adultTicket);
//	}else {
//		priceTicket = childTicket;
//		System.out.println("Child Price (20% applied): $"+childTicket);
//	}
	
	if (age >= 18 && !student) {
		priceTicket = adultTicket;
		System.out.println("Adult Price: $" + adultTicket);
	} else if (age >= 18 && student) {
		priceTicket = studentTicket;
		System.out.println("Student Price (50% applied): $" + studentTicket);
	} else if (age < 18 && student) {
		priceTicket = studentTicket * (0.80);
		System.out.println("Child & Student Special Price: (80% applied) ");
		System.out.println("Child & Student Special Price: $" + priceTicket);
	} else {
		priceTicket = childTicket;
		System.out.println("Child Price (20% applied): $" + childTicket);
	}
		return priceTicket;
		
	}
	
	@Override
	public void printPriceDay() {
		System.out.println(welcomeMessageString() +park + getPriceDay(priceDay));
	}
	
	//Overloading
	@Override
	public void printPriceDay(String keyManager, String priceDay) {
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() +park + getPriceDay(priceDay));
	}

}
