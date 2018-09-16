package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA1 = reader.readLine();
		String sA2 = reader.readLine();

		if (sA1.equals(sA2)) {
			System.out.println("Имена идентичны");

		}

		else if (sA1.length() == sA2.length()) {

			System.out.println("Длины имен равны");

		}

	}
}
