package com.capgemini.oca;

public class Person {
String name;
int age = 25;

public Person(String name) {
//	this();
	setName (name);
	
}
public Person(String name,int age) {
//	Person(name);
	setAge(age);
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}
