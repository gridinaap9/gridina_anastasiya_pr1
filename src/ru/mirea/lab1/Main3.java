package ru.mirea.lab1;

public class Main3 {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0.0;

        System.out.println("Гармоническая серия:");
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
            System.out.printf("%.2f ", sum);
    }
}}
