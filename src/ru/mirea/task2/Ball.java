package ru.mirea.task2;

public class Ball {
    private double radius;
    private String color;

    public Ball(double radius, String color){
        this.radius = 100;
        this.color = "red";
    }
    public double getRadius(){
        return getRadius();
    }
    public void setRadius(){
        this.radius = radius;
    }
    public String getColor(){
        return getColor();
    }
    public void setColor(){
        this.color = color;
    }
    public String toString(){
        return "Radius: " + this.radius + ", Color: " + this.color;
    }
}
