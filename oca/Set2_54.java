package com.capgemini.oca;

import java.util.ArrayList;
import java.util.List;

public class Set2_54 {

	public static void main(String[] args) {
		List p= new ArrayList();
		Patient p2 = new Patient("Mike");
		p.add(p2);
		int f = p.indexOf(p2);
//		Patient ps = new Patient("Mike");
//		int f = p.indexOf(ps);
//		System.out.println(f);
		if(f>=0) {
			System.out.println("Mike Found");
		}
	}

}
