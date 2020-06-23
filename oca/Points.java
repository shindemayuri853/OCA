package com.capgemini.oca;

import java.util.ArrayList;

public class Points {

	public static void main(String[] args) {
ArrayList<Integer> point = new ArrayList<> ();
point.add(1);
point.add(2);
point.add(3);
point.add(4);
point.add(null);
point.remove(2);
point.remove(null);
System.out.println(point);
	}

}
