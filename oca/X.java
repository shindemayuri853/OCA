package com.capgemini.oca;

public class X {
int a;
static int b;
public static void main(String[] args) {
	X x1 = new X();
	X x2 = new X();
	x1.a=4;
	x1.b=5;
	x2.a=6;
	x2.b=7;
	System.out.println(x1.a);
	System.out.println(x1.b);
	System.out.println(x2.a);
	System.out.println(x2.b);
}
}
