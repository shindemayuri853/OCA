package com.capgemini.oca;

import java.time.LocalDate;

public class Corrected123 {
public static void main(String[] args) {
	LocalDate date = LocalDate.of(2012, 01, 10);
	date.plusDays(10);
	System.out.println(date);
}
}
