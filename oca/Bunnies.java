package com.capgemini.oca;

public class Bunnies {
	static int c = 0;
	 Bunnies() {
while (c <10) new Bunnies(++c);
	 }
	 Bunnies(int x){
		 super();
	 }
	public static void main(String[] args) {
		new Bunnies();
		new Bunnies(c);
		System.out.println(c);
		System.out.println(c++);
	}

}
