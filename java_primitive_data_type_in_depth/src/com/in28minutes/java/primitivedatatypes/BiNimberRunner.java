package com.in28minutes.java.primitivedatatypes;

public class BiNimberRunner {

	public static void main(String[] args) {
		
		BiNumber numbers = new BiNumber(2,3);

		System.out.println(numbers.add());
		System.out.println(numbers.multiply());

		numbers.twiceValue();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
