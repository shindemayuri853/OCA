package com.capgemini.oca;

public class Corrected74 {

	public static void main(String[] args) {
		int array1 [] = new int[3];
		int array2[] = {1,2,3,4,5};
		array1 = array2;
		for(int x: array1) {
			System.out.println(x);
		}
	}

}
