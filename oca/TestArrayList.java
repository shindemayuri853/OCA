package com.capgemini.oca;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new String("1234"));
//		list.add(new Person());
//		list.add(new Book());
		list.add(new String[] {"abcd","xyz"});
//		list.add(LocalDate.now().plus(1));
	}

}
