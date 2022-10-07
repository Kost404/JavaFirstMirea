package ru.mirea.task2;
import ru.mirea.task2.Shape;
public class ShapeTest {
    public static void main(String[] args){
        Shape shape = new Shape(100,80,20);

        System.out.println(shape.getLength());
        System.out.println(shape.toString());
    }
}
