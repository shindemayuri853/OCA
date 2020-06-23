package com.capgemini.oca;

public class Q58{

	public static void main(String[] args) {
		Planet[] planets = {
				new Planet("Mercury",0),
				new Planet("Venus",0),
				new Planet("Earth",1),
				new Planet("Mars",2)
		};
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
	}

}
