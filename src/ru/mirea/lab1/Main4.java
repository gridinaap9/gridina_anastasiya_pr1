package ru.mirea.lab1;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        long factorial = calculateFactorial(num); // вызывов метода calculateFactorial()
        System.out.println("Факториал числа " + num + " = " + factorial);
    }

    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

