package com.javarush.task.task04.task0417;

/*
 * 
 *—уществует ли пара?
¬вести с клавиатуры три целых числа. ќпределить, имеетс€ ли среди них хот€ бы одна пара равных между собой чисел.
≈сли така€ пара существует, вывести на экран числа через пробел.
≈сли все три числа равны между собой, то вывести все три.
 */

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA1 = reader.readLine();
		String sA2 = reader.readLine();
		String sA3 = reader.readLine();
		int a1 = Integer.parseInt(sA1);
		int a2 = Integer.parseInt(sA2);
		int a3 = Integer.parseInt(sA3);

		if (a1 == a2 & a2 == a3) {
			System.out.print(a1 + " ");
			System.out.print(a2 + " ");
			System.out.print(a3);
		}

		else if (a1 == a2) {

			System.out.println(a1 + " " + a2);

		}

		else if (a1 == a3) {

			System.out.println(a1 + " " + a3);

		}

		else if (a2 == a3) {

			System.out.println(a2 + " " + a3);

		}

	}
}