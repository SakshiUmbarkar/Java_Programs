package com.company;
/*
 Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database
  */

import java.util.ArrayList;

class Book{
    public String name ,author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary( ArrayList<Book> books){
        this.books = books ;
    }
    public void addbook(Book book){
        System.out.println("This book has been added to the Library");
        this.books. add(book);
    }
    public void issuebook(Book book , String issued_to){
        System.out.println("This book has been issued to " + issued_to);
        this.books. remove(book);
    }
    public void returnbook(Book b){
        System.out.println("This book has been returned");
        this.books.add(b);
    }
}

public class spu_113_Ex7 {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();
        Book B1 = new Book("Algorithm","Cns");
        bk.add(B1);

        bk.add(new Book("Algorithm","Cns1"));
        bk.add(new Book("Algorithm","Cns2"));
        bk.add(new Book("Algorithm","Cns3"));
        MyLibrary l = new MyLibrary(bk);

        l.addbook(new Book("java","Sahil"));
        System.out.println(l.books);
        l.issuebook(B1,"Sahil");


    }
}
