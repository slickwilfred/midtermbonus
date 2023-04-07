package org.bcit.midterm.questions;

import java.util.ArrayList;

public class Advanced03Organization implements Advanced03Component {
    //Instance variable - departments arraylist
    private ArrayList<Advanced03Department> departments;

    //Constructor - initialize the departments arraylist
    public Advanced03Organization() {
      departments = new ArrayList<>();
    }


    //this method takes an Advanced03Department object argument
    //adds a department to the departments arraylist
    public void add(Advanced03Department department) {
      departments.add(department);
    }

  //this method takes an Advanced03Department object argument
  //removes a department from the departments arraylist
    public void remove(Advanced03Department department) {
      departments.remove(department);
    }


    //Override method from the interface
    //Has to be implemented
    //Uses a for each loop to print the departments arraylist holding the department objects
    @Override
    public void print() {
      System.out.println("Organization:");
      for (Advanced03Department department : departments) {
        department.print();
      }
    }

}
