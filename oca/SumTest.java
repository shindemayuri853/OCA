package com.capgemini.oca;

public class SumTest {
	static int count;
	public static void main(String[] args) {
		doSum(10,20);
		doSum(10.0,20.0);
		System.out.println("Result"+ 0+1);
		System.out.println("Result"+(1)+(2));
		count++;
		
	}
public static void doSum(Integer i,Integer b) {
	System.out.println("Integer"+ (i+b));
}
public static void doSum(int i,int b) {
	System.out.println("int"+ (i+b));
}
public static void doSum(double i,double b) {
	System.out.println("double"+ (i+b));
}
public static void doSum(float i,float b) {
	System.out.println("float"+ (i+b));
}
}
