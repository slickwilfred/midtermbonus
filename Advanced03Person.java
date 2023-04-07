package org.bcit.midterm.questions;

//This class implements the Advanced03Component interface
//Allows it to have access to the interface's methods
//This works well as I need to add people and departments to a single arraylist
public class Advanced03Person implements Advanced03Component{
  //Instance variables
  String name;
  String title;


  //Constructor - takes two string arguments to create a person object
  public Advanced03Person(String name, String title) {
    //Initialize instance variables
    this.name = name;
    this.title = title;
  }

  //Override method from the interface
  //Prints the person's name and title
  @Override
  public void print() {
    System.out.println("Person: " + name + ", Title: " + title);
  }
}

