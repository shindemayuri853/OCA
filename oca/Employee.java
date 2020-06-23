package com.capgemini.oca;

public class Employee {
//public int salary;
private String name;
private int age;
private int salary;

public Employee(String name, int age) {
	setName (name);
	setAge (age);
	setSalary(2000);
}
public Employee (String name, int age, int salary) {
	setSalary(salary);
//	this(name,age);
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void printDetails() {
	System.out.println(name+ ":" +age+ ":"+salary);
}
}
