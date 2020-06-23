package com.capgemini.oca;

public class WildAnimal extends Animal{
//String bounds;
//
//WildAnimal (String bounds){
//	
//}
//WildAnimal (String type, int maxSpeed, String bounds){
//}
	public static void main(String[] args) {
		String names [] = {"Thomas", "Peter", "Joseph"};
		String pwd [] = new String [3];
		int idx = 0;
		try {
			for (String n: names) {
				pwd [idx]= n.substring(2,6);
				idx++;
			}
		} catch ( Exception e) {
System.out.println("Invalid");	
}
		for (String p: pwd) {
			System.out.println(p);
		}
		}
}
