package org.bcit.midterm.questions;

import java.util.ArrayList;

public class Basic07Book {
    //Instance variables
    String title;
    String author;
    int year;


    //Constructor - takes three arguments
    //Every book object needs a title, author, year
    public Basic07Book(String title, String author, int year){
      this.title = title;
      this.author = author;
      this.year = year;
    }

    //Accessor - returns the value of the title instance variable
    public String getTitle(){
      return title;
    }


    //Mutator - sets the title instance variable
    public void setTitle(String title){
      this.title = title;
    }


    //Accessor - returns the value of the author instance variable
    public String getAuthor(){
      return author;
    }

    //Mutator - sets the value of the author instance variable
    public void setAuthor(String author){
      this.author = author;
    }

    //Accessor - returns the value of the year instance variable
    public int getYear(){
      return year;
    }

    //Mutator - sets the value of the year instance variable
    public void setYear(int year){
      this.year = year;
    }


    //toString method returns the title, author and year in a string format
    @Override
    public String toString(){
      return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year + "\n";
    }


}
/*
This question tests my knowledge of OOP concepts, specifically the creation and manipulation of classes and
their objects.
It tests my ability to use data structures to store and manage objects as well as my ability to trace through code.




Basic07:
Create a program that simulates a library system.
The system should have a class called "Book" that has attributes such as "title", "author", and "year".

There should also be a class called "Library" that has methods such as "addBook", "removeBook", and "findBook".
The Library class should have a list of books and the methods should manipulate that list.

In addition, the program should have a main method that creates an instance of Library, adds some books,
removes some books, and finds a book by title. Finally, trace the code from the main method and
write down in a comment the exact sequence of method calls that are executed in the correct order.
Include only the method calls.


 */