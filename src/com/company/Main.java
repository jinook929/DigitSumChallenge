package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in this number is " + sumDigits(-1));
        System.out.println("The sum of the digits in this number is " + sumDigits(1));
        System.out.println("The sum of the digits in this number is " + sumDigits(125));
        System.out.println("The sum of the digits in this number is " + sumDigits(4125));
        System.out.println("The sum of the digits in this number is " + sumDigits(123456789));


    }

    private static int sumDigits (int number) {
        System.out.println(number);
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                int x = number % 10;
                sum += x;
                number /= 10;
            }

            return sum;
        }

        return -1;
    }
}
