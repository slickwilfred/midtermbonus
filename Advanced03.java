package org.bcit.midterm.questions;

import java.util.ArrayList;
import java.util.List;

public class Advanced03 implements Advanced03Component {
  //I don't need to create instance variables to print the other classes
  //because the other classes have a print method defined in them
  //as override methods from the interface
  public static void main(String[] args) {

    //Create new Advanced03Person objects
    Advanced03Person will = new Advanced03Person("Will", "Marketing Intern");
    Advanced03Person paul = new Advanced03Person("Paul", "Marketing Manager");
    Advanced03Person jeeho = new Advanced03Person("Jeeho", "Sales Manager");
    Advanced03Person jason = new Advanced03Person("Jason", "Sales Intern");

    //Create new Advanced03Department objects
    Advanced03Department marketing = new Advanced03Department("Marketing");
    //Add people to the marketing arraylist
    marketing.add(will);
    marketing.add(paul);

    Advanced03Department sales = new Advanced03Department("Sales");
    //Add people to the sales arraylist
    sales.add(jeeho);
    sales.add(jason);
    sales.add(marketing);


    //Create new Advanced03Organization object
    Advanced03Organization organization = new Advanced03Organization();
    //add sales to the organization arraylist
    organization.add(sales);

    //use the override print method to print out the organization
    organization.print();

    System.out.println("\nRemoving Jeeho from Sales:");
    //Remove the Person charlie object from the sales arraylist
    sales.remove(jeeho);
    //use the override print method to print out the organization
    organization.print();
  }

  @Override
  public void print() {

  }
}


/*
This question tests my understanding and ability to implement the Composite design pattern.


In this question, I created a class hierarchy that represents an organizational hierarchy using the Composite Pattern.
The classes include a Person class, a Department class, and an Organization class. The person, department,
and organization classes should all implement a print method, while the department and organization classes should also implement add and remove methods.
The point is to test my ability to create a hierarchy using the Composite Pattern and demonstrate how it works with an example organization.






Advanced03:
You are working on a project that requires you to develop a system for managing a company's organizational hierarchy. You decide to implement this system using the Composite Pattern.

Your task is to create a class hierarchy that represents composed organizational elements. The classes should include:

A Person class that has a name and title attribute.
A Department class that represents a department in the company. A department can contain one or more persons and/or other departments.
An Organization class that represents the entire company. An organization can contain one or more departments.
The Person, Department, and Organization classes should all implement a print method that outputs information about the object to the console. The Department and Organization classes should also implement add and remove methods that allow new elements to be added or removed from the hierarchy.

Write a main method that demonstrates how your Composite Pattern works by creating an Organization that has at least two levels of nesting within it. For example, the Organization might have a Sales department that contains a Marketing department, which in turn contains several Person objects.

Your test should demonstrate that all the objects in the hierarchy can be printed and that the add and remove methods work correctly to modify the hierarchy.










*/