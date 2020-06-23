package com.capgemini.oca;

public class TestScope {

	public static void main(String[] args) {
		int var1 = 200;
	System.out.println(doCal(var1));
	System.out.println(var1);
	}

	private static int doCal(int var1) {
		var1 = var1*2;
		return var1;
	}

}
