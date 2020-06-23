package com.capgemini.oca;

public class TestQ {

	public static void main(String[] args) {
		int numbers[];
		numbers = new int[2];
		numbers[0]=10;
		numbers[1]=20;
		
		numbers = new int [4];
		numbers[0]=10;
		numbers[1]=20;
		for(int x: numbers) {
			System.out.println(x);
		}
	}

}
