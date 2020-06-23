package com.capgemini.oca;

public class CheckAmount {
public int amount;
public CheckAmount(int amount) {
	this.amount = amount;
}

	public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

public void changeAmount(int x) {
	
}
	public static void main(String[] args) {
		CheckAmount ck = new CheckAmount((int)(Math.random())*1000);
		ck.setAmount(-ck.getAmount());
		System.out.println(ck.amount);
	}

}
