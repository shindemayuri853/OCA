package com.capgemini.oca;

public class Set1_62 {

	public static void main(String[] args) {
		Student [] student = new Student[3];
		student [0]= new Student ("Richard");
		student [2]= new Student ("Donald");
		for (Student s: student) {
			System.out.println(""+s.name);
		}
	}

}
