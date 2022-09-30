package ru.mirea.task1;
import java.util.Scanner;
public class Ex7 {

    public static void main(String[] args){
        System.out.println("Введите факториал");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        factor(x);
    }

    public static void factor(int n){
        int factor = 1;
        for (int i = 1; i <= n; i++){
            factor = factor * i;
        }
        System.out.println(factor);
    }
}