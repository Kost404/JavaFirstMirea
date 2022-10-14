package ru.mirea.task3;
import java.util.Scanner;
import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = 0;
        while (n <= 0) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Введенное число должно быть больше 0. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int[] mas1 = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * (n + 1));
            if (mas1[i] % 2 == 0) {
                k++;
            }
        }
        System.out.println(Arrays.toString(mas1));
        int[] mas2 = new int[k];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (mas1[i] % 2 == 0) {
                mas2[j] = mas1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}
