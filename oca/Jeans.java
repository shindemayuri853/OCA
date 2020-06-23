package com.capgemini.oca;
import static com.capgemini.oca.Shirt.getColot;
//import com.capgemini.oca.Shirt;
//import com.capgemini.oca.*;
public class Jeans {
public void matchShirt() {
	//String color = Shirt.getColot();
	String color = getColot();
	if(color.equals("Green")) {
		System.out.println("Green");
	}
}
public static void main(String[] args) {
	Jeans trouser = new Jeans();
	trouser.matchShirt();
}
}
