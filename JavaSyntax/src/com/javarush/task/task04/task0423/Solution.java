package com.javarush.task.task04.task0423;

/* 
������ � ���������� ��� � �������. ���� ������� ������ 20 ������� ������� "� 18-�� ����������".
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String sA1 = reader.readLine();
		String sA2 = reader.readLine();
		int a2 = Integer.parseInt(sA2);
		
		
		if (a2>20) {
			
			System.out.println("� 18-�� ����������");
		}
    }
}
