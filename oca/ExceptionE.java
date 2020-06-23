package com.capgemini.oca;

import java.util.ArrayList;

public class ExceptionE {
public static void main(String[] args) {
	ArrayList myList = new ArrayList();
	String[] myArray;
	try {
		while(true) {
			myList.add("My String");
			System.out.println("Hello");
		}
	} catch (RuntimeException re) {
		System.out.println("Caught");
	}catch (Exception e) {
		System.out.println("Exception");
	}
	System.out.println("Ready to use");
}
}
