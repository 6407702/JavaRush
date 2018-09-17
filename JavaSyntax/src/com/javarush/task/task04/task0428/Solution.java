package com.javarush.task.task04.task0428;
/*
 * Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
 * */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        arr[0] = Integer.valueOf(reader.readLine());
        arr[1] = Integer.valueOf(reader.readLine());
        arr[2] = Integer.valueOf(reader.readLine());

        int counter = 0;

        for (int a : arr) {
            if (a > 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}