package com.capgemini.oca;

import java.util.Scanner;

public class WhileDo {

	public static void main(String[] args) {
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter");
//		int i = scr.nextInt();
//		do {
//			System.out.println("Hello");
//		} while(i==1);
//		String[] p= {"mam","ans","jah"};
//		outer:
//		for(String i :p) {
//			for(String a :p) {
//				if(a.equals("ans"))
//					continue outer;
//				System.out.println(a);
//			}
//		}
		int i=0;
		for(;i<3;i=i+5) {
			if(i<5)
				continue;
			System.out.println(i);
		}
		System.out.println("hello");
	}

}
