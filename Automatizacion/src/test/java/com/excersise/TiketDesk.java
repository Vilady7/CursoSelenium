package com.excersise;

public class TiketDesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double priceCoolPark = 150;
		double priceTestersPark = 160;
		int age = 25;
		boolean student = true;
		
//		CoolParkTicket coolPark = new CoolParkTicket(priceCoolPark, age, student);
//		coolPark.printPriceDay();
//		coolPark.getTicketPrice();
//
//		TestersParkTicket testersPark = new TestersParkTicket(priceTestersPark, age, student);
//		testersPark.printPriceDay();
//		testersPark.getTicketPrice();	
		
		TicketsParks ticket = new CoolParkTicket(priceCoolPark, age, student);
		ticket.printPriceDay();
		ticket.getTicketPrice();
		
		ticket = new TestersParkTicket(priceTestersPark, age, student); //Polimorfismo
		ticket.printPriceDay();
		ticket.getTicketPrice();
	}

}
