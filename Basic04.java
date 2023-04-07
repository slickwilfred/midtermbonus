package org.bcit.midterm.questions;


//interface class
public interface Basic04 {

  //This method displays the items in the menu
  void displayBasic04();

}


/*

This question tests my ability to create and implement interfaces in Java. I created an interface and
implemented it into two different classes - this allows me to use the concept of polymorphism, enabling the different
food and beverage items to be treated as if they were the same type.

Basic04:
You are designing a system to manage a restaurant's ordering system. Create a new interface called "Basic04"
which promises a single method called "displayBasic04" that displays information about the order item.

Create two concrete classes that implement the "Basic04" interface: "FoodItem" and "BeverageItem".
The "FoodItem" class should have the following attributes:
(1) "name" that represents the name of the food item.
(2) "description" that represents the description of the food item.
(3) "price" that represents the price of the food item.

The "BeverageItem" class should have the following attributes:
(1) "name" that represents the name of the beverage item.
(2) "size" that represents the size of the beverage item.
(3) "price" that represents the price of the beverage item.

Create a new class called "OrderManager" that has the following attribute:
(1) "items" which is an ArrayList of "Basic04" objects.

Define a method in the "OrderManager" class called "addItem" that takes an "Basic04" object as an argument and
adds it to the "items" ArrayList.

Define a method in the "OrderManager" class called "displayOrder" that displays information about all the items
in the "items" ArrayList by calling the "displayBasic04" method for each item.

Create a new instance of the "OrderManager" class and add some "FoodItem" and "BeverageItem" objects to it. Then call the "displayOrder" method to display information about all the items in the order.

Note: You may modify the "FoodItem", "BeverageItem", and "OrderManager" classes if you need to, but it is not required.

 */