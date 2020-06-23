package com.capgemini.oca;

public class Car extends Vehicle{
//String trans;
//Car(String trans){
//	this.trans = trans;
//}
//
//Car(String type,int maxSpeed,String trans){
//	super(type,maxSpeed);
//	this(trans);
//}
	int y;
	public Car() {
		super(10);
//		super();
//		this(20);
		
	}
	Car(int y){
		super(y);
		this.y=y;
	}
	public String toString() {
		return super.x + ""+this.y;
	}
	public static void main(String[] args) {
		Vehicle v = new Car(20);
		System.out.println(v);
	}
	}
