package com.javarush.task.task04.task0424;

/* 
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. 
Вывести на экран порядковый номер числа, отличного от остальных.
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a1 = Integer.valueOf(reader.readLine());
		int a2 = Integer.valueOf(reader.readLine());
		int a3 = Integer.valueOf(reader.readLine());

		if (a1 == a2) {
			if (a3 != a1) {
				System.out.println(3);
			}
		} else if (a2 == a3) {
			System.out.println(1);
		} else if (a3 == a1) {
			System.out.println(2);
		}
	}
}
