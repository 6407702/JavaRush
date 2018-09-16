package com.javarush.task.task04.task0425;

/* 
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA = reader.readLine();
		String sB = reader.readLine();
		int a = Integer.parseInt(sA);
		int b = Integer.parseInt(sB);

		int result = 0;

		if (a > 0 & b > 0) {

			result = 1;
		}

		else if (a < 0 & b > 0) {
			result = 2;

		}

		else if (a < 0 & b < 0) {
			result = 3;

		}

		else if (a > 0 & b < 0) {
			result = 4;

		}

		System.out.println(result);
	}
}
