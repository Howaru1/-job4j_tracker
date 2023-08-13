package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        book3.setName("Clean Code");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean Code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}