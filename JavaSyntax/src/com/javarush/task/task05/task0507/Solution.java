package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Мужчина и женщина
*/

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int result = 0;
		while (!(line = reader.readLine()).equals("сумма")) {
			result=result +  Integer.parseInt(line);
		}

		System.out.println(result);
	}
}