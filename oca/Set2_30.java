package com.capgemini.oca;

public class Set2_30 {

	public static void main(String[] args) {
		A b1= new A();
		A b2 = new C();
		A b3 = (B) b2;
		b1 =(A) b2;
		b1.test();
		b3.test();
	}

}
