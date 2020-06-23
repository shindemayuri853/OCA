package com.capgemini.oca;

public class Set2_9 {
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer"+(x+y));
	}
	public static void doSum(Double x, Double y) {
		System.out.println("Double"+(x+y));
	}
//	public static void doSum(float x, float y) {
//		System.out.println("Float"+(x+y));
//	}
	public static void doSum(Long x, Long y) {
		System.out.println("Long"+(x+y));
	}
	public static void main(String[] args) {
		doSum(10,20);
		doSum(10.0,20.0);
	}

}
