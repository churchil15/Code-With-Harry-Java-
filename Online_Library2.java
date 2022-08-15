package com.company;

import java.util.ArrayList;
import java.time.LocalDate;

class Book {
    public String name, authorName;

    public Book(String a, String b){
        name = a;
        authorName = b;
    }

    // Object class ke andar toString() method hota hai jisko override krke aap apni ArrayList ke elements ko print krwa skte ho ek specific format me
    @Override
    public String toString(){
        return "\nBook " + "Name = '" + name + "', Author Name = '" + authorName + "'";
    }
}

class LMS{
    public ArrayList<Book> books;  // jo bhi books add ki jayengi vo iss ArraList me maintain hongi

    public LMS(ArrayList<Book> a){    // aap jo element pass kroge yha pr vo ek ArrayList hona chaiye Book Class ka
        books = a;                    // aisa kuch nhi hai ki yha pr aapko ek element pass krna hai jo ki Book Class ka object ho
    }

    public void add(Book a){
        System.out.println("Your book has been added!!\n");
        books.add(a);
    }

    public void issue(Book name){
        LocalDate date = LocalDate.now();
        System.out.println("\n" + name + " is been issued to you");
        System.out.println("Issued Date: " + date + "\n");
        books.remove(name);
    }

    public void returnBook(Book name){
        System.out.println("\nThanks for returning!!");
        books.add(name);
    }


}
public class Online_Library2 {
    public static void main(String[] args) {
        System.out.println("****************** Welcome to Online Library ******************");
        ArrayList<Book> bk = new ArrayList<>();   // bk ek ArrayList hai jiske andar jo elements honge vo Book Class ke objects hone chaiye

        Book b1 = new Book("Let us C", "Yashwant Kanetkar");
        bk.add(b1);

        Book b2 = new Book("Java", "James Gosling");
        bk.add(b2);

        Book b3 = new Book("2 States", "Chetan Bhagat");
        bk.add(b3);


        LMS student1 = new LMS(bk);
        System.out.println(student1.books);    // You can access the ArrayList<Books> books attribute to print all the available books
//        student1.add(new Book("Algorithm", "Churchill"));
//        System.out.println(student1.books);
//
        student1.issue(b3);
        System.out.println(student1.books);

        student1.returnBook(b3);
        System.out.println(student1.books);

    }
}
