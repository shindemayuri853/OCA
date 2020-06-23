package com.capgemini.oca;

public class Vowel {
private char var;
public static void main(String[] args) {
	char var1 = 'a';
	char var2 = var1;
	var2='o';
	Vowel v = new Vowel();
	Vowel v2 = v;
	v.var = 'i';
	v2.var='o';
	System.out.println(var1 +"Hello"+ var2);
	System.out.print(v.var +"Welcome"+ v2.var);
}

}
