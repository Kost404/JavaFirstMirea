package ru.mirea.task3;
import java.util.Random;
import ru.mirea.task3.Ex2circle;

public class Ex2Tester {
    public static void main(String[] args) {
        Ex2circle[] Circles = new Ex2circle[10];
        Random rand = new Random();

        for(int i = 0; i<10; i++)
            Circles[i] = new Ex2circle(rand.nextInt(100) , new Ex2point(rand.nextInt(10),rand.nextInt(10)));

        sortArray(Circles);
    }
    public static void sortArray(Ex2circle[] array){
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if (array[j].getRadius() > array[j + 1].getRadius()) {
                    Ex2circle tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        printArray(array);
    }

    public static void printArray(Ex2circle[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print("Radius: " + array[i].getRadius() + " ");
        System.out.println();
        System.out.print("TheBiggestRadius: " + array[9].getRadius() + " ");
        System.out.println();
        System.out.print("THeSmallestRadius: " + array[0].getRadius() + " ");
        System.out.println();
    }
}
