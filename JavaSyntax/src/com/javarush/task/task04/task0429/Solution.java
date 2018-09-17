package com.javarush.task.task04.task0429;
/*
 *Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения. 
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		arr[0] = Integer.valueOf(reader.readLine());
		arr[1] = Integer.valueOf(reader.readLine());
		arr[2] = Integer.valueOf(reader.readLine());

		int counter = 0;
		int counter2 = 0;

		for (int a : arr) {
			if (a > 0) {
				counter++;
			}

			else if (a<0)
				counter2++;
		}

		System.out
				.println("количество отрицательных чисел: " + counter2 + ",количество положительных чисел: " + counter);
	}
}