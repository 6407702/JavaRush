package com.javarush.task.task04.task0425;

/* 
������ � ���������� ��� ����� �����, ������� ����� ������������ �����, �� ������� �� ������������ ���� OX � OY.
������� �� ����� ����� ������������ ��������, � ������� ��������� ������ �����.
���������:
�������������� ����� � ������������ (a,b) � ����� �� ��������� ������������ ��������� �������:
��� ������ �������� a>0 � b>0;
��� ������ �������� a<0 � b>0;
��� ������� �������� a<0 � b<0;
��� ��������� �������� a>0 � b<0.
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
