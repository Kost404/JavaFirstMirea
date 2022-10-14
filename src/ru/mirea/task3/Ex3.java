package ru.mirea.task3;
import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 10;
        int max = 99;
        int k = 0;
        int[] Num;
        Num = new int[4];
        for(int i = 0; i<4; i++)
            Num[i] = rand.nextInt(max - min) + min;
        System.out.println(Arrays.toString(Num));

        for(int i = 0; i<3; i++)
            if(Num[i]<Num[i+1]) {
                k = k + 1;
            }
            if(k==3){
                System.out.println("Последовательность строго возрастает");
            } else {
                System.out.println("Последовательность не строго возрастает");
            }

            }


    }
