package org.bcit.midterm.questions;

public class Advanced05 {

  public static void main(String[] args) {

    //Create a new room object
    Advanced05Room room = new Advanced05Room();


    //Create different furniture objects
    Advanced05Furniture chair = new Advanced05Furniture("Chair");
    Advanced05Furniture table = new Advanced05Furniture("Table");
    Advanced05Furniture desk = new Advanced05Furniture("Desk");


    //Use the add furniture method to add the furniture to the room at different positions
    room.addFurniture(chair, 1, 2);
    room.addFurniture(table, 2,3);
    room.addFurniture(desk, 4,4);


    //Use a for each loop to print out the furniture in the room object
    System.out.println("Furniture placement in the room:");
      for (Advanced05Furniture furniture : room) {
        System.out.println(furniture);
      }
  }
}

/*

This new version of the question tests the same logic as the original question by asking me to create a class hierarchy
involving a furniture class and a room class. The room class has a 2d array collection of furniture objects and implements the Iterable interface.

I have to implement the Iterable interface in the room class, which tests my ability to create and use iterators.
The main method demonstrates how the iteration works, displaying how to use iterators.




Advanced05:
// TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Advanced_05_myClass. Name them something
  // useful, other than "myClass", that is just an example.

  // Prefix all following classes with Advanced_05_
  // TODO 1: Create a new class called Furniture which has:
  // - itemName: String

  // TODO 2: Create a new class called Room which has:
  // - furnitures: 2D-Array-like collection of Furniture
  // - method: createRoom, which creates a 5x5 grid of Furniture

  // TODO 3: Make Room implement Iterable and follow through the
  // full specification of the JavaDoc. You can use the default iterators
  // to iterate through the full room, but be careful to actually use
  // the defaults correctly!

  // TODO 4: Create a main method in this class which demonstrates your iteration.




 */