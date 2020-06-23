package com.capgemini.oca;

public class Programmers extends Employees{
String name ="Prog";
void printValues() {
	System.out.println(this.name+":");
	System.out.println(this.address+":");
	System.out.println(super.name+":");
	System.out.println(super.address);
}
}
