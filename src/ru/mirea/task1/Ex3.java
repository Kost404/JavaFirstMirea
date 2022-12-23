package ru.mirea.task1;

import java.util.Random;
import java.lang.System;



public class Ex3 {
    public static void main(String[] args){
        int[] array = new int[10];
        Random r = new Random();
        for (int i=0;i<=array.length-1;i++){
            array[i]=r.nextInt(100);
        }
        int s=0;
        for (int j=0;j<=array.length-1;j++){
            s=s+array[j];
        }
        System.out.println("сумма элементов массива равна с цыклом фор: "+s);
        int whil=0;
        int sum=0;
        while (whil<=array.length-1) {
            sum=sum+array[whil];
            whil++;
        }
        System.out.println("сумма элементов массива равна с цыклом вайл: "+sum);
        int whildo=0;
        int summ=0;
        do {
            summ=summ+array[whildo];
            whildo++;
        } while (whildo<=array.length-1);
        System.out.println("сумма элементов массива равна с цыклом вайл ду: "+summ);
    }
}
