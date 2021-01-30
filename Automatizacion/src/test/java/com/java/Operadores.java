package com.java;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Arítmeticos
		
		int x = 2;
		int y = 3;
		int z = x+y;
		
		System.out.println("Este es el valor de Z = "+z);
		
//		Unarios
		
		int A = 1;
		int B = 2;
		
		System.out.println("Incrementa "+ ++B); 
		System.out.println("Decrementa "+ --B);
		System.out.println("Positivo "+ +A); 
		System.out.println("Negativo "+ -A);
		
//		Relacionales
		
		if  (A != B ) {
			System.out.println("BLOCK CODE");
		}
		
//		Condicionales
		
		int var1 = 5;
		int var2 = 6;
		int var3 = 5;
		int var4 = 5;
		
		if (var1 == var2 || var3 == var4) {
			System.out.println("BLOCK CODE 2");
		}

	}

}
