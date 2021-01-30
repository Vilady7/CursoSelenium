package com.java;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		While

		int numero = 1;

		while (numero <= 10) {
			System.out.println("El numero es " + numero);
			++numero;

		}

//		DO WHILE
		int numeroLimite = 20;
		int sumTotal = 0;
		int count = 0;
		do {
			sumTotal += numeroLimite;
			++count;

		} while (sumTotal < 100);
		System.out.println("El numero se sumo " + count);
	}

}
