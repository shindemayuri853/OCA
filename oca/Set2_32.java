package com.capgemini.oca;

public class Set2_32 {
	public static void main(String[] args) {
		String[][] arr = { { "A", "B", "C" }, { "D", "E" } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(j);
				System.out.println(arr[i].length);
				System.out.println(arr[i][j]);
				if (arr[i][j].equals("B")) {
					continue;
				}
			}
			continue;
		}
	}
}
