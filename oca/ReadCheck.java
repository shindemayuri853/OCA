package com.capgemini.oca;

public class ReadCheck {
void readCard(int cardNo) throws RuntimeException{
	System.out.println("Reading Card");
}
void checkCard(int cardNo) throws RuntimeException{
	System.out.println("Checking Card");
}
public static void main(String[] args) {
	ReadCheck t = new ReadCheck();
	int cardNo =12344;
	t.checkCard(cardNo);
	t.readCard(cardNo);
	
}
}
