package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 
 * ������ � ���������� ����� �����. ������� �� ����� ��� ������-�������� ���������� ����:
"������������� ������ �����" - ���� ����� ������������� � ������,
"������������� �������� �����" - ���� ����� ������������� � ��������,
"����" - ���� ����� ����� 0,
"������������� ������ �����" - ���� ����� ������������� � ������,
"������������� �������� �����" - ���� ����� ������������� � ��������.
 */

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(reader.readLine());

		if (a < 0 & a % 2 == 0) {
			System.out.println("������������� ������ �����");
		}

		else if (a < 0 & a % 2 != 0) {
			System.out.println("������������� �������� �����");

		}

		else if (a == 0) {

			System.out.println("����");
		}

		else if (a > 0 & a % 2 == 0) {
			System.out.println("������������� ������ �����");
		}

		else if (a > 0 & a % 2 != 0) {
			System.out.println("������������� �������� �����");
		}
	}

}
