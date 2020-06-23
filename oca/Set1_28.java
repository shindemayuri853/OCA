package com.capgemini.oca;

public class Set1_28 {
void readCard (int cardNo) throws Exception {
	System.out.println("Reading Card");
}
void checkCard(int cardNo) throws RuntimeException{
	System.out.println("Checking Card");
}
public static void main(String[] args) {
	Set1_28 ex = new Set1_28();
	int cardNo = 12344;
//	ex.readCard(cardNo);
	ex.checkCard(cardNo);
}
}
