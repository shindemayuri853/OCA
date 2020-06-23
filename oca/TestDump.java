package com.capgemini.oca;

public class TestDump {
static void dispplayResult(int[] num) {
	try {
		System.out.println(num[1]/(num[1]-num[2]));
	} catch (ArithmeticException e) {
		System.out.println("first");
	}
	System.out.println("Done");
}
static void mix(String foodin) {
	foodin.concat("A");
	foodin.replace('c', 'b');
}
public static void main(String[] args) {
	 
//	try {
//		int[] arr = {100,100};
//		dispplayResult(arr);
//	} catch (IllegalArgumentException ie) {
//		System.out.println("Second");
//	} catch (Exception e) {
//		System.out.println("third");
//	}
//	StringBuilder sb = new StringBuilder(10*5);
//	double d = (int)100;
//	System.out.println(d);
	String food = "corn";
	System.out.println(food);
	mix(food);
	System.out.println(food);
}
}
