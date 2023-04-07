package org.bcit.midterm.questions;

//Implements the interface Basic04
public class Basic04BeverageItem implements Basic04{
  //Instance variables
  String beverageName;
  String beverageSize;
  double bPrice;

  //Constructor
  public Basic04BeverageItem(String name, String size, double price){
    this.beverageName = name;
    this.beverageSize = size;
    this.bPrice = price;
  }

  //Override method from the implemented interface
  //Displays the menu
  @Override
  public void displayBasic04() {
    System.out.println("\nBeverage name: " + beverageName + "\nBeverage size: "
                       + beverageSize + "\nPrice: $" + bPrice);
  }
}
