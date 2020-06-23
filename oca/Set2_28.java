package com.capgemini.oca;

public class Set2_28 {

	public static void main(String[] args) {
	int x=100;
	int a=x++;
	System.out.println(a);
	//System.out.println(x++);
	int b=++x;
	int c=x++;
	int d=(a<b)?(a<c)?a:(b<c)?b:c:x;
	System.out.println(d);
	
	int num [] [] = new int [3][1];
	System.out.println(num.length);
	
	}

}
