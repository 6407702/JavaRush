package com.javarush.done.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum = number%10;
        int res=number /10;
         sum = sum + res%10;
        res=res /10;
        sum = sum + res%10;

        return sum;
    }
}