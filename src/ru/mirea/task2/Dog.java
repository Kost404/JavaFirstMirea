package ru.mirea.task2;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int toHumanAge() {
        return this.age * 7;
    }

    public String toString() {
        return "Age in human years: " + toHumanAge() + ", Age: " + this.age + ", Name: " + this.name;
    }
}