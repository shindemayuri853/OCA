package com.capgemini.oca;

public class Corrected102 {
	static int count=0;
	int i=0;
	
	public void change() {
		while(i<5) {
			count++;
			i++;
			System.out.println(i);
		}
	}
public static void main(String[] args) {
	Corrected102 c = new Corrected102();
	Corrected102 c2 = new Corrected102();
	c.change();
	c2.change();
	System.out.println(c.count );
	System.out.println(c2.count);
}
}
