package com.capgemini.oca;

public class Walter {

	public static void main(String[] args) {
		String stuff="TV";
		String res = null;
		res = stuff.equals("TV")? "Walter": stuff.equals("Movie")?"White":"No"; 
//		stuff.equals("TV")? res="Walter": stuff.equals("Movie")?res="White":res="No";
	System.out.println(res);
	}

}
