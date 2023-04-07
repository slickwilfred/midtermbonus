package org.bcit.midterm.questions;

import java.util.ArrayList;

//Library class
public class Basic07Library {
  //Instance variable - ArrayList to hold the library books
  ArrayList<Basic07Book> bookList;

  //Constructor - sets the bookList to a new ArrayList
  public Basic07Library(){
    this.bookList = new ArrayList<>();
  }

  //This method takes a Basic07Book object as an argument
  //Adds the book object to the bookList ArrayList
  public void addBook(Basic07Book o) {
    bookList.add(o);
  }

  //This method takes a Basic07Book object as an argument
  //Removes the book object to the bookList ArrayList
  public void removeBook(Basic07Book o){
    bookList.remove(o);
  }

  //This method finds a book title - takes a String title as an argument
  //Uses a for each loop to iterate through the book objects
  //If the book object's title equals the searched title, it'll return the book
  public Basic07Book findBook(String title){
    for (Basic07Book o : bookList){
      if(o.getTitle().equalsIgnoreCase(title)){
        return o;
      }
    }
    return null;
  }

  public static void main(String[] args){
    //Create a new Basic07Library object called lib
    Basic07Library lib = new Basic07Library();

    //Create new book objects
    Basic07Book harrypotter = new Basic07Book("Harry Potter", "J.K. Rowling", 1995);
    Basic07Book lotr = new Basic07Book("Lord Of The Rings", "J.R.R. Tolkien", 1960);
    Basic07Book lotf = new Basic07Book("Lord Of The Flies", "Will Ondrik", 1995);
    Basic07Book wtp = new Basic07Book("Winnie The Pooh", "A.A. Milne", 1975);

    //Use the addBook method to add books to the library
    lib.addBook(harrypotter);
    lib.addBook(lotr);
    lib.addBook(lotf);
    lib.addBook(wtp);

    //Print out the current library contents
    System.out.println("\033[4m" + "Books in library" + "\033[0m");
    for (Basic07Book o : lib.bookList){
      System.out.println(o);
    }

    //Remove winnie the pooh from the library
    lib.removeBook(wtp);


    //Print the new contents of the library object
    System.out.println("\033[4m" + "Winnie The Pooh has been removed - Current book list" + "\033[0m");
    for (Basic07Book o : lib.bookList){
      System.out.println(o.toString());
    }

    //Create a new string called bookTitle to search for a book in the library
    String bookTitle = "Lord Of The Flies";

    //Create a new book object
    //Use the findBook method on the library object to look for the book title
    Basic07Book foundBook = lib.findBook(bookTitle);

    //If the foundBook object isn't null - print its title
    if (foundBook != null){
      System.out.println("Book found: " + foundBook.getTitle());
    } else {
      //If the foundBook object is null - print "book not found"
      System.out.println("Book not found");
    }

  }
}
