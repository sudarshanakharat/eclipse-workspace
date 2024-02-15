package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		// Book cleanCode = new Book(1000);
		
		System.out.println(artOfProgramming.getNoOfCopies());
		System.out.println(artOfProgramming.getNoOfCopies());
		artOfProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(50);
		// cleanCode.setNoOfCopies(45);
		artOfProgramming.increaseNoOfCopies(100);
		effectiveJava.increaseNoOfCopies(50);
		// cleanCode.increaseNoOfCopies(45);
		artOfProgramming.decreaseNoOfCopies(10);
		effectiveJava.decreaseNoOfCopies(50);
		// cleanCode.decreaseNoOfCopies(45);

		System.out.println(artOfProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
	}
	}

