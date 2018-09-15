package com.javarush.task.task04.task0416;

/*
Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше или равна сумме двух других, то треугольника с такими сторонами не существует.


Требования:
1. Программа должна считывать три числа c клавиатуры.
2. Программа должна выводить текст на экран согласно условия задачи.
3. Если треугольник с такими сторонами может существовать, необходимо вывести текст: "Треугольник существует."
4. Если треугольник с такими сторонами не может существовать, необходимо вывести текст: "Треугольник не существует."
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA = reader.readLine();
		String sB = reader.readLine();
		String sC = reader.readLine();
		int a = Integer.parseInt(sA);
		int b = Integer.parseInt(sB);
		int c = Integer.parseInt(sC);
		
		if (Compare(a,b,c) & Compare(a,c,b) & Compare (b,c,a)) {
			
			System.out.println("Треугольник существует.");
		}
		
		else {
			
			System.out.println("Треугольник не существует.");
		}
		
		

	}
	
	public static boolean Compare (int a, int b, int c) {
		
		if (a+b>c) {
		
		return true;}
		
		else return false;
		
	}
	

}
