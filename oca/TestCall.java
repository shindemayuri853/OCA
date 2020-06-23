package com.capgemini.oca;

public class TestCall {
public static void main(String[] args) {
	Caller c = new Caller();
//	c.start();
//	c.init();
	int x=10;
	int a=x++;
	int b=++x;
	System.out.println(x);
	System.out.println(a);
	System.out.println(b);
}
}
