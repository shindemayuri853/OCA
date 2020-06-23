package com.capgemini.oca;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MiscMethodArrayList {

	public static void main(String[] args) {
		ArrayList<MyPerson> myArrayList= new ArrayList<MyPerson>();
		MyPerson p1 = new MyPerson("Shreya");
		MyPerson p2 = new MyPerson("Paul");
		myArrayList.add(p1);
		myArrayList.add(p2);
		myArrayList.add(p2);
		System.out.println(myArrayList.contains(new MyPerson("Shreya")));
		System.out.println(myArrayList.contains(p1));
		System.out.println(myArrayList.indexOf(new MyPerson("Paul")));
		System.out.println(myArrayList.indexOf(p2));
		System.out.println(myArrayList.lastIndexOf(new MyPerson("Paul")));
		System.out.println(myArrayList.lastIndexOf(p2));
		Period p = Period.parse("-p5w");
		System.out.println(p);
		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate l = LocalDate.parse("2057-01-29",d1);
		System.out.println(l);
		StringBuilder ejp = new StringBuilder(10+2+"SUN"+4+5);
		System.out.println(ejp);
		int bill = 2000;
		int discount;
		discount =bill>2000?15:10;
		System.out.println(discount);
	}

}
