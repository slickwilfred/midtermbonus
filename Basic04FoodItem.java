package org.bcit.midterm.questions;

//Basic04FoodItem implements the Basic04 interface
public class Basic04FoodItem implements Basic04{
  //Instance variables
  String foodName;
  String description;
  double fPrice;


  //Basic04FootItem constructor
  public Basic04FoodItem(String name, String desc, double price){
    this.foodName = name;
    this.description = desc;
    this.fPrice = price;
  }


  //Override method from the Basic04 interface class
  //This class is required to implement the interfaces methods
  @Override
  public void displayBasic04() {
    System.out.println("\nFood name: " + foodName + "\nFood description: "
        + description + "\nPrice: $" + fPrice);
  }
}
