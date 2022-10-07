package ru.mirea.task2;

public class Shape {
    private int length;
    private int width;
    private int size;

    public Shape(int length, int width, int size) {
        this.length = length;
        this.width = width;
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", width=" + width +
                ", size=" + size +
                '}';
    }
}