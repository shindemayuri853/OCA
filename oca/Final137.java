package com.capgemini.oca;

public class Final137 {
void readCard(int cardNo) throws Exception
{
	System.out.println("Reading Card");
	}

void checkCard (int cardNo) throws RuntimeException {
	System.out.println("Checking Card");
}

public static void main (String [] args) {
	Final137 f = new Final137();
	int cardNo = 12344;
	f.checkCard(cardNo);
//	f.readCard(cardNo);
}
}
