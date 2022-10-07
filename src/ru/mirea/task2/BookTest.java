package ru.mirea.task2;
import ru.mirea.task2.Book;
public class BookTest {
    public static void main(String[] args){
        Book book = new Book("Voina i mir", "Tolstoy L. N.");
        System.out.println(book.getName());
        System.out.println(book.toString());
    }
}
