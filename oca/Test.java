package com.capgemini.oca;

public class Test {
	//public static void main(String[] args) {
//		Employee e1 = new Employee("Jack",50);
//		Employee e2 = new Employee("Chloe", 40, 5000);
////		Employee e = new Employee();
////		e.printDetails();
//		e1.printDetails();
//		e2.printDetails();
//	}
		public void updatePrice(Product product,double price) {
			price = price*2;
			product.price = product.price+price;
			System.out.println(price);
			System.out.println(product.price);
		}
		public static void main(String[] args) {
			Product prt = new Product();
			prt.price = 200;
			double newPrice = 100;
			
			Test t = new Test();
			t.updatePrice(prt, newPrice);
			System.out.println(prt.price +":"+newPrice);
	}

}
