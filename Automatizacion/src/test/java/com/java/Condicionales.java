package com.java;

public class Condicionales {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    int velocidad = 130; //KM/H
	    int limiteVelocidad = 80;
	    
//	    if (velocidad > limiteVelocidad) {
//	    	System.out.println("El coche va a excceso de velocidad");
//	    }else {
//	    	System.out.println("El coche va en la velocidad adecuada");
//	    }
	    
//	    IF Anidado
	    
	    boolean carretera = true;
	    
	    if (carretera) {
	    	
	    System.out.println("Estas en una carretera");
	    	
	    limiteVelocidad = 110;
	    	
	    	if(velocidad > limiteVelocidad) {
	    	    	System.out.println("El coche va a excceso de velocidad");
	    	    }else {
	    	    	System.out.println("El coche va en la velocidad adecuada");
	    	    }
	    }else if (velocidad > limiteVelocidad) {
					System.out.println("El coche esta en una calle y va a excceso de velocidad");
		}else {
			System.out.println("El coche esta en una calle y va en la velocidad adecuada");
		}	    
	    
//	    SWITCH CASE
	    
	    int temperatura = 30;
	    switch(temperatura) {
	    
	   case 5:
	    	System.out.println("mucho frio");
	    	break;
	    	
	   case 10:
	    	System.out.println("frio");
	    	break;

	   case 20:
			System.out.println("clima agradable");
			break;	 
			
	   case 30:
			System.out.println("calor");
			break;
			
		default:
			System.out.println("no encontro temperatura");
		    
	    }
	    		
	}

}
