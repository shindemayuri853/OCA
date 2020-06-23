package com.capgemini.oca;

public class Count112 {

	public static void main(String[] args) {
		int data[]= {2010,2011,2012,2013,2014,2015};
		int key = 2014;
		int count =0;
		for(int i:data) {
			if (i!=key) {
				continue;
					//count++;
			}
		}
		System.out.println(count);
	}

}
