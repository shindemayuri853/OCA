package com.capgemini.oca;

public class Set2_57 {

	public static void main(String[] args) {
//		int x=6;
//		while(isAvailable(--x)) {
//			System.out.println(x);
////			x--;
//		}
//		StringBuilder sb = new StringBuilder("MayuriShinde");
//				StringBuilder sb2 = new StringBuilder("Mayuri Shinde");
//				sb.delete(4,7);
//				System.out.println(sb);
//				sb2.delete(4,7);
//				System.out.println(sb2);
		int var=9;
		if (var++<10) {
			System.out.println(var+"Hello Universe");
		} else {
System.out.println(var+"Hello World");
		}
	}
	public static boolean isAvailable(int x) {
		return x-->0?true:false;
	}

}
