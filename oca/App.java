package com.capgemini.oca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
String myStr = "7007";

public void doStuff(String str) {
	int myNum =0;
	try {
		String myStr = str;
		myNum = Integer.parseInt(myStr);
	} catch (NumberFormatException e) {
		System.out.println("Error");
	}
	System.out.println("myStr: "+myStr+ ",myNum: "+myNum);
}

public static void main(String[] args) {
	App obj = new App();
	obj.doStuff("9009");
	LocalDate d = LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE_TIME);
	System.out.println(d);
}
}
