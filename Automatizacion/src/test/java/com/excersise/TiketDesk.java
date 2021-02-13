package com.excersise;

public class TiketDesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double priceCoolPark = 150;
		double priceTestersPark = 160;
		int age = 12;
		boolean student = true;
		
//		CoolParkTicket coolPark = new CoolParkTicket(priceCoolPark, age, student);
//		coolPark.printPriceDay();
//		coolPark.getTicketPrice();
//
//		TestersParkTicket testersPark = new TestersParkTicket(priceTestersPark, age, student);
//		testersPark.printPriceDay();
//		testersPark.getTicketPrice();	
		
//		TicketsParks ticket = new CoolParkTicket(priceCoolPark, age, student);
//		ticket.printPriceDay();
//		ticket.getTicketPrice();
		
//		ticket = new TestersParkTicket(priceTestersPark, age, student); // Polimorfismo
//		ticket.printPriceDay();
//		ticket.getTicketPrice();
		
		TicketsParks ticket = new CoolParkTicket(priceCoolPark, age, student);
		ticket.printPriceDay();
		double priceCoolTicket= ticket.getTicketPrice();
		
		ticket = new TestersParkTicket(priceTestersPark, age, student, 10); //Polimorfismo
		ticket.printPriceDay();
		double priceTestersTicket= ticket.getTicketPrice();

		double totalPrice = sumTicketsParks(priceCoolTicket, priceTestersTicket);

		System.out.println("Total Tickets: $"+totalPrice);

	}
	
	public static double sumTicketsParks(double park1, double park2) {
		return park1 + park2;
	}


}
