package com.javarush.task.task05.task0502;

/* 
Создание кота
*/

public class Cat {
	public int age;
	public int weight;
	public int strength;

	public Cat() {
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public boolean fight(Cat anotherCat) {
		// напишите тут ваш код

		if (this.age > anotherCat.age & this.weight > anotherCat.weight & this.strength > anotherCat.strength) {

			return true;
		}

		else
			return false;

	}

	public static void main(String[] args) {

	}
}
