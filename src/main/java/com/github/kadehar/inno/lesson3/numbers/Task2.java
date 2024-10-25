package com.github.kadehar.inno.lesson3.numbers;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        double[] numbers = new double[3];
        numbers[0] = Math.PI;
        numbers[1] = Math.E;
        numbers[2] = 1.0;
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 1.56789;
        numbers[1] = 0.75643;
        numbers[2] = 1.00467;
        System.out.println(Arrays.toString(numbers));
    }
}
