package com.javarush.task.task04.task0432;

/**
 *������ � ���������� ������ � ����� N.
������� �� ����� ������ N ��� ��������� ���� while. ������ �������� � ����� ������.
 * */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s1 = reader.readLine();
    	int a1 = Integer.parseInt(reader.readLine());
		

    	
    	
    	while (a1>0) {
    		
    		System.out.println(s1);
    		a1--;
    	}

    }
}