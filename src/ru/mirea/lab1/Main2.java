package ru.mirea.lab1;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sumDW = 0;
        int i = 0;
        do {
            sumDW += array[i];
            i++;
        } while (i < size);
        int max = array[0];
        i = 1;
        while (i < size) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        int min = array[0];
        i = 1;
        while (i < size) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        System.out.println("Сумма элементов массива: " + sumDW);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
