package com.javarush.task.task04.task0418;

/* 
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(
				Math.min(
						Integer.parseInt(reader.readLine()), 
						Integer.parseInt(reader.readLine())
						)
				);

	}
}