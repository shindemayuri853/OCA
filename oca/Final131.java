package com.capgemini.oca;

public class Final131 {

	public static void main(String[] args) {
		String [] str = new String[2];
		int idx = 0;
		for (String s: str) {
			str[idx].concat("element"+idx);
			idx++;
		}
		for (idx = 0; idx<str.length; idx++) {
			System.out.println(str[idx]);
		}
	}

}
