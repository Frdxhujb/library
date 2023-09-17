package org.example.Task6_labrary;

import java.util.ArrayList;
import java.util.Calendar;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Journal> records;

    public Library() {
        this.books = new ArrayList<>();
        this.records = new ArrayList<>();
    }

    public Library(ArrayList<Book> books, ArrayList<Journal> records) {
        this.books = books;
        this.records = records;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Journal> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Journal> records) {
        this.records = records;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book issuanceBook(String title, String author) {
        for (int i = 0; i < books.size(); i++) {
            Book tmpBook = books.get(i);
            if (tmpBook.getTitle().equals(title) && tmpBook.getAuthor().equals(author)) {
                books.remove(i);
                return tmpBook;
            }
        }
        return null;
    }



    public void addIssuanceRecord(Book book, LibraryCard card, Calendar dateOfIssue, int term) {
        if (book != null) {
            Journal record = new Journal(book, card, dateOfIssue, term);
            records.add(record);
        }
    }

    @Override
    public String toString() {
        return "\nLibrary{ " +
                "\nКниги: " + books +
                ", \nЗаписи: " + records +
                '}';
    }

    public String bookToString(){
        return "\nНаличие книг:" + books;
    }

    public String jornalToString(){
        return "\nЗаписи в журнале:" + records;
    }
}
