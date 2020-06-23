package com.capgemini.oca;

public class Set2_44 {
String myStr ="9009";
public void doStuff(String str) {
	int myNum = 0;
	try {
		String myStr = str;
		myNum = Integer.parseInt(myStr);
	} catch (Exception e) {
		System.out.println("Error");
	}
	System.out.println("myStr:"+myStr +"myNum:"+myNum);
}
	public static void main(String[] args) {
		Set2_44 obj = new Set2_44();
		obj.doStuff("7007");
	}

}
