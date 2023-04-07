package org.bcit.midterm.questions;

import java.util.Iterator;

//Room class representing a grid of furniture items
class Advanced05Room implements Iterable<Advanced05Furniture> {
  //Instance variable
  //2d array
  private Advanced05Furniture[][] furnitures;


  //Constructor
  //Calls the create room method to create a new room
  public Advanced05Room() {
    createRoom();
  }


  //This method creates a 7x7 null furniture grid
  public void createRoom() {
    furnitures = new Advanced05Furniture[7][7];
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 7; j++) {
        furnitures[i][j] = null;
      }
    }
  }

  //This method adds furniture items to the null furniture grid
  public void addFurniture(Advanced05Furniture furniture, int row, int col) {
    //If the furniture items position is within the furniture grid
    //Place it in the grid
    if (row >= 0 && row < furnitures.length && col >= 0 && col < furnitures[row].length) {
      furnitures[row][col] = furniture;
    } else {
      //If the furniture item's position is outside of the bounds of the 2d array
      //Print an error message
      System.out.println("Incorrect positioning: (" + row + ", " + col + ")");
    }
  }


  //Override iterator method from the Iterable interface
  @Override
  public Iterator<Advanced05Furniture> iterator() {
    return new Iterator<>() {
      //Initialize the indices of rows/columns to 0
      private int rowIndex = 0;
      private int columnIndex = 0;

      //Override the has next method from the Iterable interface
      //It checks if the row index is less than number of rows in the 2d array and if the column index is less than-
      //the number of columns in the 2d array at the current row index
      //If these conditions are true - there are more furniture items to iterate over
      //If these conditions are false - the end of the array has been reached
      @Override
      public boolean hasNext() {
        if (rowIndex < furnitures.length && columnIndex < furnitures[rowIndex].length){
          return true;
        } else {
          return false;
        }
      }


      //Override the next method from the Iterable interface
      @Override
      public Advanced05Furniture next() {
        //Get the current furniture item's position in the furniture grid
        Advanced05Furniture currentItem = furnitures[rowIndex][columnIndex];
        //Increment the column index to check the next location
        columnIndex++;

        //Once the end of the column is reached, reset it
        //By resetting the column and incrementing the row, we'll continue to iterate through the grid
        if (columnIndex >= furnitures[rowIndex].length) {
          columnIndex = 0;
          rowIndex++;
        }
        //Return the current furniture item
        return currentItem;
      }
    };
  }
}