package com.javarush.task.task04.task0419;

/*
 * 
 * 
 * ћаксимум четырех чисел
¬вести с клавиатуры четыре числа, и вывести максимальное из них.
≈сли числа равны между собой, необходимо вывести любое.
 */

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA1 = reader.readLine();
		String sA2 = reader.readLine();
		String sA3 = reader.readLine();
		String sA4 = reader.readLine();

		int a1 = Integer.parseInt(sA1);
		int a2 = Integer.parseInt(sA2);
		int a3 = Integer.parseInt(sA3);
		int a4 = Integer.parseInt(sA4);

		System.out.println(Math.max(Math.max(a1, a2), Math.max(a3, a4)));

	}
}
