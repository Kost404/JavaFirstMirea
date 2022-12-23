package ru.mirea.task6.movable;
public class MovableTest {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1,1,5,3);
        System.out.println("Initial position of point: "+p1);
        p1.moveUp();
        p1.moveRight();
        System.out.println("Ending position of point:: "+p1);
        MovableCircle c1= new MovableCircle(5,5,3,3,2);
        System.out.println("Initial position of circle: "+c1);
        c1.moveLeft();
        c1.moveUp();
        System.out.println("Ending position of circle: "+c1);
    }
}