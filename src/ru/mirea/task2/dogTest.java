package ru.mirea.task2;
import ru.mirea.task2.Dog;
import java.util.ArrayList;
public class dogTest {
    public static void main(String[] args) {
        ArrayList<Dog> Dogs = new ArrayList<>();

        Dogs.add(new Dog(3, "Rio"));
        Dogs.add(new Dog(7, "Snegok"));

        dogSpisok(Dogs);
    }

    private static void dogSpisok(ArrayList<Dog> Dogs) {
        for (Dog Dog : Dogs) System.out.println(Dog);
    }
}

