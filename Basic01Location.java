package org.bcit.midterm.questions;

public class Basic01Location {

  // Static counter to keep track of location IDs
  private static int locationIDCount = 0;
  // Instance variables for each location
  private int locationID;
  private String locationName;
  private float locationX;
  private float locationY;
  private int moveCount;

  //Constructor
  //Initialize a new location
  public Basic01Location(String locationName, float locationX, float locationY) {
    this.locationID = locationIDCount++;
    this.locationName = locationName;
    this.locationX = locationX;
    this.locationY = locationY;
    this.moveCount = 0;
  }

  //Method to move a location to new coordinates and increment move count
  public void move(float x, float y) {
    this.locationX = x;
    this.locationY = y;
    this.moveCount++;
  }


  //Accessor method
  //Returns the value of the locationname instance variable
  public String getName() {
    return locationName;
  }

  //Accessor method
  //Returns the value of the locationx instance variable
  public float getX() {
    return locationX;
  }

  //Accessor method
  //Returns the value of the locationy instance variable
  public float getY() {
    return locationY;
  }

  //Accessor method
  //Returns the value of the moveCount instance variable
  public int getMoveCount() {
    return moveCount;
  }

  //Main method to test
  public static void main(String[] args) {

    //Create two location objects
    Basic01Location location1 = new Basic01Location("Location A", 4, 6);
    Basic01Location location2 = new Basic01Location("Location B", 1, 3);

    //Print the starting positions
    System.out.println(location1.getName() + " starting position: " + location1.getX() + ", " + location1.getY());
    System.out.println(location2.getName() + " starting position: " + location2.getX() + ", " + location2.getY());

    //Move location1 and print
    location1.move(3, 4);
    System.out.println("\n\nAfter move --> " + location1.getName() + " current position: " + location1.getX() + ", " + location1.getY() + " move count: " + location1.getMoveCount());

    //Move location2 and print
    location2.move(6, 7);
    System.out.println("\n\nAfter move --> " + location2.getName() + " current position: " + location2.getX() + ", " + location2.getY() + " move count: " + location2.getMoveCount());
  }
}
