package com.capgemini.oca;

public class Corrected10 {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder(5);
	String s ="";
	if(sb.equals(s)) {
		System.out.println("Match1");
	} else if(sb.toString().equals(s.toString()))
		System.out.println("Match2");
}
}
