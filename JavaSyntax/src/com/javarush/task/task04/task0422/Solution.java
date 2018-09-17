package com.javarush.task.task04.task0422;

/* 
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA1 = reader.readLine();
		String sA2 = reader.readLine();
		int a2 = Integer.parseInt(sA2);
		
		
		if (a2<18) {
			
			System.out.println("Подрасти еще");
		}

    }
}
