package org.bcit.midterm.questions;


// Furniture class representing an item in the room
public class Advanced05Furniture {
  //Instance variable
  private String itemName;


    //Constructor - sets up furniture object
    public Advanced05Furniture(String itemName) {
      //Initialize instance variable
      this.itemName = itemName;
    }


    //toString method
    //returns the name of the piece of furniture
    public String toString() {
      return "Item: " + itemName;
    }

}
