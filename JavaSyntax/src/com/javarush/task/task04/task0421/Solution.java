package com.javarush.task.task04.task0421;

/* 
����� ��� �����?
������ � ���������� ��� �����, � ���� ����� ���������� ������� ��������� "����� ���������".
���� ����� ������, �� �� ����� ����� - ������� ��������� - "����� ���� �����".
���� ����� � ����� ���� ������ - ������ �� ��������.
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA1 = reader.readLine();
		String sA2 = reader.readLine();

		if (sA1.equals(sA2)) {
			System.out.println("����� ���������");

		}

		else if (sA1.length() == sA2.length()) {

			System.out.println("����� ���� �����");

		}

	}
}
