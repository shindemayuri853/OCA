package com.capgemini.oca;

public class TestEqual {

	public static void main(String[] args) {
		Book b1 = new Book("1234-5678");
		Book b2 = new Book("1234-5678");
		System.out.println(b1.equals(b2)+ ":");
		System.out.println(b1==b2);
	}

}
