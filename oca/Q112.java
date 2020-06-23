package com.capgemini.oca;

public class Q112 {

	public static void main(String[] args) {
		int data[] = {2010,2011,2014,2015};
		int key = 2014;
		int count = 0;
		for (int e: data) {
			if(e!= key) {
				continue;
	//			count++;
			}
		}
		System.out.println(count);
	}

}
