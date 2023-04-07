package org.bcit.midterm.questions;

import java.util.ArrayList;


public class Advanced03Department implements Advanced03Component {
  //Instance variables
  String name;
  //Since Advanced03Department and Advanced03Person both implement the same interface,
  //I'm able to store both department and person objects in the same list
  ArrayList<Advanced03Component> components = new ArrayList<>();


  //Constructor - takes on string argument
  public Advanced03Department(String name) {
    this.name = name;
  }

  //Mutator - returns the value of the name instance variable
  public String getName() {
    return name;
  }

  //Mutator - sets the instance variable
  public void setName(String name) {
    this.name = name;
  }

  //This method adds a component to the components arraylist
  //takes an argument that represents the component object
  public void add(Advanced03Component component) {
    components.add(component);
  }

  //This method removes a component from the components arraylist
  //takes an argument that represents the component object
  public void remove(Advanced03Component component) {
    components.remove(component);
  }


  //Override method from the interface class
  //Always need to implement all methods of an interface in the classes that implement it
  @Override
  public void print() {
    //Uses a for each loop to print every component of the components arraylist
    System.out.println("Department: " + name);
    for (Advanced03Component component : components) {
      component.print();
    }
  }
}

