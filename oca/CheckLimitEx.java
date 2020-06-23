package com.capgemini.oca;

public class CheckLimitEx {
	public static final int Min =1;
	public static void main(String[] args) {
	int x= args.length;
	if(checkLimit(x)) {
		System.out.println("Java SE");
	} else {
		System.out.println("Java EE");
	}
	}
public static boolean checkLimit(int x) {
	return (x>= Min)? true:false;
}
}
