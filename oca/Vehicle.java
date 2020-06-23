package com.capgemini.oca;

public class Vehicle {
//public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder(5);
//	String s ="";
//	if(sb.equals(s)) {
//		System.out.println("Match1");
//	} else if(sb.toString().equals(s.toString())) {
//		System.out.println("Match2");
//	} else {
//		System.out.println("No Match");
//	}
//}
//String type = "4W";
//int maxSpeed = 100;
//public Vehicle(String type,int maxSpeed) {
//	this.type = type;
//	this.maxSpeed= maxSpeed;
//}
	int x;
public Vehicle() {
		this(10);
}
Vehicle(int x){
	this.x=x;
}

}
