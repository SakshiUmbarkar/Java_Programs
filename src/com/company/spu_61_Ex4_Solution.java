package com.company;

class Library{
    String[] books;
    int no_of_books ;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books ++;
        System.out.println(book + "This book is added.");
    }
    void issueBook(String book){
        for (int i = 0; i <this.books.length ; i++) {
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i] = null;
                    continue ; // we want to skip only null value break will not make you see other books
            }
        }
        System.out.println("This book doesn't exist.");
    }
    void returnBook(String book){
        addBook(book);
    }

    void showAvailableBooks(){
        System.out.println("Available books are :");
        for (String book:this.books) {
            if (book == null){
                break;
            }
            System.out.println("* " + book);
            
        }

    }
}

public class spu_61_Ex4_Solution {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();


        centralLibrary.showAvailableBooks();


    }
}
