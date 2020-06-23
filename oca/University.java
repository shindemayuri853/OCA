package com.capgemini.oca;

public class University {
 University() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		EJavaCourse course[] = {new EJavaCourse(),new EJavaCourse()};
		course[0].courseName="OCA";
		for (EJavaCourse c : course) c = new EJavaCourse();
		for (EJavaCourse c: course) 
			System.out.println(c.courseName);
	}

}
