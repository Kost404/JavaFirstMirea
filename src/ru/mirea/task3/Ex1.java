package ru.mirea.task3;

public class Ex1 {
    public static void main(String[] args)
    {
        double a = 729.321;
        String b = "8372";
        Double x = Double.valueOf(a);
        System.out.println("valueOf(a) = " + x);
        x = Double.valueOf(b);
        System.out.println("ValueOf(b) = " + x);
        double val = Double.parseDouble(b);
        System.out.println("parseDouble = " + val);
        int c = (int)a;
        byte d = (byte)a;
        char e = (char)a;
        short f = (short)a;
        long g = (long)a;
        float h = (float)a;
        System.out.println("int = " + c + ", byte = " + d + ", char = " + e + ", short = " + f + ", long = " + g + ", float = " + h);
        Double pi = 3.141592653589793;
        String piStr = Double.toString(pi);
        System.out.println("Pi String: " + piStr);


    }
}
