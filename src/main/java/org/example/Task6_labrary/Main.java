//      В библиотеке решили автоматизировать учет книг, выданных студентам.
//        Студент, для того чтобы получить книгу, должен получить читательский билет,
//        если не получал ранее. В читательском билете содержится информация:
//        ■ номер билета;
//        ■ фамилия и имя студента;
//        ■ номер группы.
//        При выдаче книги библиотекарь фиксирует в журнале:
//        ■ название и автора книги;
//        ■ номер билета, на который выдана книга;
//        ■ дата выдачи;
//        ■ на какое время выдана книга (в сутках).
//        При приеме книги библиотекарь фиксирует в журнале:
//        ■ название и автора книги;
//        ■ номер билета студента, который вернул книгу;
//        ■ дата возврата.
//        Разработать модель программы, которая бы позволила находить должников
//        (студентов, которые не сдали книгу вовремя).

package org.example.Task6_labrary;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Иваношвили", "Гурджа", "Г-34");
        Student stu2 = new Student("Иванов", "Дмитрий", "С-22");
        Student stu3 = new Student("Лукьянова", "Даша", "Г-34");
        Student stu4 = new Student("Филимонова", "Маша", "С-22");

        Book b1 = new Book("Война и мир", "Л.Н.Толстой");
        Book b2 = new Book("Анна Каренина", "Л.Н.Толстой");
        Book b3 = new Book("После балла", "Л.Н.Толстой");
        Book b4 = new Book("Детство. Отрочество. Юность.", "Л.Н.Толстой");

        Library library = new Library();

        LibraryCard lc1 = new LibraryCard(1, stu1);
        Calendar dateOfIssue = new GregorianCalendar(2023,8,14);
        //Journal record1 = new Journal(b1, lc1, dateOfIssue,7);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);

        Book issuancedBook = library.issuanceBook("Война и мир", "Л.Н.Толстой");
        library.addIssuanceRecord(issuancedBook, lc1, dateOfIssue,7);
        library.addIssuanceRecord(library.issuanceBook("После балла", "Л.Н.Толстой"),
                new LibraryCard(3, stu3), new GregorianCalendar(2023,8,11),7);

        lc1.addCard(1,stu1);
        lc1.addCard(2,stu2);
        lc1.addCard(3,stu3);
        lc1.addCard(4,stu4);
        System.out.println(library.bookToString());
        System.out.println(library.jornalToString());

//        System.out.println(stu1);
//        System.out.println(stu2);
//        System.out.println(stu3);
//        System.out.println(stu4);
//        System.out.println(b1);
//        System.out.println(lc1);
//        System.out.println(library);
    }
}
