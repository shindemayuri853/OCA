package com.capgemini.oca;

import java.util.ArrayList;

public class ArrayListExanple {

	public static void main(String[] args) {
		ArrayList<String> myArray=new ArrayList();
		myArray.add("one");
		myArray.add("two");
		ArrayList<String> yourArray = new ArrayList<String>();
		yourArray.add("three");
		yourArray.add("four");
		myArray.addAll(1,yourArray);
		for(String val:myArray)
			System.out.println(val);
		
	}

}
