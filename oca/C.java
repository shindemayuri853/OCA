package com.capgemini.oca;

import java.util.Scanner;

public class C extends A{
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int i = s.nextInt();
//		double discount = 0;
//		if (i > 80 && i < 90) {
//			discount = 0.2;
//			System.out.println(discount);
//		} else {
//			discount = 0;
//			System.out.println(discount);
//		}
//		if (i > 90) {
//			discount = 0.5;
//			System.out.println(discount);
//		} else {
//			discount = 0;
//			System.out.println(discount);
//		}
//		System.out.println(discount);
//
//	}
public void test() {
	System.out.println("C");
}
public static void main(String[] args) {
	A b1 = new A();
	A b2 = new C();
	b1=(A) b2;
	A b3 = (B)b2;
	b1.test();
	b3.test();
}
}
