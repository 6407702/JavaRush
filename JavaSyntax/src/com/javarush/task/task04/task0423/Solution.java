package com.javarush.task.task04.task0423;

/* 
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA1 = reader.readLine();
		String sA2 = reader.readLine();
		int a2 = Integer.parseInt(sA2);
		
		
		if (a2>20) {
			
			System.out.println("И 18-ти достаточно");
		}
    }
}
