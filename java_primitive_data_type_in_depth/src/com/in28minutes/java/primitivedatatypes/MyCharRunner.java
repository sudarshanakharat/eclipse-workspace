package com.in28minutes.java.primitivedatatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isVowel()); // 'a','e', 'i','o','u' and capitals
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
