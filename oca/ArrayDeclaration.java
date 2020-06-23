package com.capgemini.oca;

public class ArrayDeclaration {

	public static void main(String[] args) {
		String s1[] [] = new String[1][2];
		String s2 [][]= new String [][] {{},{}};
		String s3 [][]= new String [2][2];
//		String s4[][]= new String[][] {{null},new String[] {"a","b","c"},
//		{new String{}}};
//		String s5[][]=new String[][2];
//		String s6[][]= new String [][] {"A","B"};
//		String s7[][]=new String[] {{"A"},{"B"}};
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
