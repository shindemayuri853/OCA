package com.capgemini.oca;

public class MyExam {
void question() {
	try {
		question();
	} catch (StackOverflowError e) {
System.out.println("Caught");
}
}
	public static void main(String[] args) {
		new MyExam().question();
	}

}
