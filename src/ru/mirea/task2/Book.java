package ru.mirea.task2;

public class Book {
    private String name;
    private String avtor;
    public Book(String name, String avtor){
        this.name = "Voina i mir";
        this.avtor = "Tolstoy L. N.";
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getAvtor(){
        return avtor;
    }
    public void setAvtor(){
        this.avtor = avtor;
    }
    public String toString(){
        return "Name: " + this.name + ", Avtor: " + this.avtor;
    }
}
