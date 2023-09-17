package org.example.Task6_labrary;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Journal {
    private Calendar dateOfIssue;
    private Calendar dateReturn;
    private int term;
    private Book book;
    private LibraryCard card;
    private String titleBook;
    private String authorBook;
    private int numberCard;

    public Journal() {
    }

    public Journal(Book book, LibraryCard card, Calendar dateOfIssue, int term) {
        this.titleBook = book.getTitle();
        this.authorBook = book.getAuthor();
        this.numberCard = card.getNumberCard();
        this.dateOfIssue = dateOfIssue;
        this.dateReturn = new GregorianCalendar(0,0,0);
//        this.dateReturn = (Calendar) dateOfIssue.clone();
//        this.dateReturn.add(Calendar.DAY_OF_MONTH, term);
        this.term = term;
    }

    public Calendar getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Calendar dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Calendar getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Calendar dateReturn) {
        this.dateReturn = dateReturn;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    @Override
    public String toString() {
        return "\nJournal {" +
                "\nДата выдачи: " + dateOfIssue.getTime() +
                ", \nДата возврата: " + dateReturn.getTime() +
                ", \nСрок выдачи: " + term +
                ", \nНазвание книги: " + titleBook +
                ", \nАвтор: " + authorBook +
                ", \nНомер читательского билета: " + numberCard +
                '}';
    }
}