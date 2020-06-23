package com.capgemini.oca;

import java.util.ArrayList;

public class EJGArrayL {

	public static void main(String[] args) {
		ArrayList<String> season = new ArrayList<>();
		season.add(0, "aaaaa");
		season.add(1,"Spring");
		season.add(2,"Summer");
		season.add(3,"Autumn");
		season.add(4,"Winter");
		season.remove(2);
		for (String s: season)
			System.out.println(s +",");
	}

}
