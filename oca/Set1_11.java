package com.capgemini.oca;

public class Set1_11 {
int al;
public static void doProduct(int a) {
	a =a*a;
}
public static void doString(String s) {
	s.concat(""+s);
}
	public static void main(String[] args) {
		Set1_11 item = new Set1_11();
		item.al=11;
		String sb = "Hello";
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.al);
		System.out.println(i+":"+sb+":"+item.al);
	}

}
