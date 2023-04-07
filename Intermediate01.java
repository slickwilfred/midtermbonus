package org.bcit.midterm.questions;

public class Intermediate01 {

  public static void main(String[] args){

  }
}






/*
This question tests my ability to create more complex code from a UML diagram. I have to fully understand the different UML syntax
as well as the different relationships between the classes it contains. This tests my understanding of UML diagrams.


Intermediate01:
In this question, you are given a UML Class diagram represented in an image file /img/class.diagram.png. Your task is to recreate the class diagram in code using separate classes prefixed with Intermediate_01_.

The class diagram consists of four classes: Intermediate_01_Store, Intermediate_01_Item, Intermediate_01_Electronic, and Intermediate_01_Book. The classes have the following relationships and attributes:

Intermediate_01_Store has a private attribute inventory that is a list of Intermediate_01_Item objects.
Intermediate_01_Item is an abstract class with two attributes: title and price.
Intermediate_01_Electronic is a subclass of Intermediate_01_Item with one additional attribute: serialNumber.
Intermediate_01_Book is a subclass of Intermediate_01_Item with one additional attribute: author.
To complete this question, you should create a new file in the org.bcit.comp2522.winter2023.midterm.answers package called Intermediate_01_myClass and create four classes: Intermediate_01_Store, Intermediate_01_Item, Intermediate_01_Electronic, and Intermediate_01_Book. Your classes should match the relationships and attributes specified in the UML Class diagram.

Note that the Intermediate_01_Item class is an abstract class and cannot be instantiated. The Intermediate_01_Store class should have a private inventory attribute that is a list of Intermediate_01_Item objects.

You should carefully read and follow the UML Class diagram when creating your classes to ensure that they match the specified relationships and attributes.


 */