package com.capgemini.oca;

public class CcMask {
	public static  String mask(String CardNo) {
		String x="xxxx-xxxx-xxxx-";
		StringBuilder sb = new StringBuilder(x);
		sb.append(CardNo,15,19);
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(mask("1234-5678-5486-4512"));
	}
}
