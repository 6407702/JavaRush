package com.javarush.task.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat("Vaska");
		Cat cat2 = new Cat("Vaska");
		System.out.println(cat1.equals(cat2));

		System.out.println(cat1 == cat2);
	}
	
	static class Cat {
		
		String Name;
		
		public Cat(String Name) {
			
		this.Name= Name;	
		}
		
	}
	
	

}
