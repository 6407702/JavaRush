package com.javarush.task.task04.task0429;
/*
 *������ � ���������� ��� ����� �����. ������� �� ����� ���������� ������������� � ���������� ������������� ����� � �������� ������, � ��������� ����:
"���������� ������������� �����: �", "���������� ������������� �����: �",
��� �, � - ������� ��������. 
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
				.println("���������� ������������� �����: " + counter2 + ",���������� ������������� �����: " + counter);
	}
}