package com.capgemini.oca;

public class ArrayIndex {
public static void main(String[] args) {
	String[][] array = new String[][] {
		{"A","B"},null,{"C","D",null}
	};
	System.out.println(array[1][1]);
}
}
