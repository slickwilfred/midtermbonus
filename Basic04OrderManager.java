package org.bcit.midterm.questions;

import java.util.ArrayList;
public class Basic04OrderManager {
  //Instance variable - items arraylist
  ArrayList<Basic04> items;


  //Constructor
  public Basic04OrderManager() {
    items = new ArrayList<>();
  }

  //Add item method
  //adds an object into the arraylist
  public void addItem(Basic04 o) {
    items.add(o);
  }


 //Displays the order
  //Prints the items from the items arraylist
  public void displayOrder() {
    System.out.println("\033[4m" + "Order details" + "\033[0m");
    for (int i = 0; i < items.size(); i++) {
      items.get(i).displayBasic04();
    }
  }

  public static void main(String[] args) {

    //Create a new instance of the order manager
    Basic04OrderManager order = new Basic04OrderManager();

    //Created new instances of menu drinks
    Basic04BeverageItem pop = new Basic04BeverageItem("Pop", "Large", 2.75);
    Basic04BeverageItem juice = new Basic04BeverageItem("Juice", "Medium", 2.25);
    Basic04BeverageItem tea = new Basic04BeverageItem("Tea", "Small", 1.50);

    //Created new instances of food
    Basic04FoodItem burger = new Basic04FoodItem("Burger", "Please no tomatoes", 15.75);
    Basic04FoodItem pizza = new Basic04FoodItem("Pizza", "Remove any mushrooms from the pizza", 20);
    Basic04FoodItem salad = new Basic04FoodItem("Salad", "I'm allergic to nuts, so please make sure there's none in the salad", 10.25);

    //Add items to the order
    order.addItem(pop);
    order.addItem(juice);
    order.addItem(tea);
    order.addItem(burger);
    order.addItem(pizza);
    order.addItem(salad);


    //Display the order
    order.displayOrder();




  }
}

