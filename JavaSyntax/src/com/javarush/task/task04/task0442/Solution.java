package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;

public class Solution {
	private static int result;

	public static void main(String[] args) throws Exception {
		// напишите тут ваш код
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int a1;
		int result=0;

		while ((a1 = Integer.parseInt(reader.readLine())) != -1) {

			result = result + a1;

		}

		System.out.println(result);

	}
}