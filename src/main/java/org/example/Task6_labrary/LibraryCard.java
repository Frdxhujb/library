package org.example.Task6_labrary;

import java.util.ArrayList;

public class LibraryCard {
    private int numberCard;
    private Student student;
    private ArrayList<LibraryCard> libraryCards;

    public LibraryCard() {
        numberCard = 0;
        this.student = new Student();
    }

    public LibraryCard(int numberCard, Student student) {
        this.numberCard = numberCard;
        this.student = student;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<LibraryCard> getLibraryCards() {
        return libraryCards;
    }

    public void setLibraryCards(ArrayList<LibraryCard> libraryCards) {
        this.libraryCards = libraryCards;
    }
        //доработать
    public void addCard(int number, Student student){
        LibraryCard newCard = new LibraryCard(number,student);
        libraryCards = new ArrayList<>();
        libraryCards.add(newCard);
    }
    @Override
    public String toString() {
        return "\nLibraryCard {" +
                "\nНомер карты: " + numberCard +
                ", \nСтудент: " + student +
                '}';
    }

    public String myToString(){
        return libraryCards.toString();
    }
}
