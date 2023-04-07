package org.bcit.midterm.questions;

public class Intermediate02 {


    public static void main(String[] args) {
      Intermediate02Client client = new Intermediate02Client();
      client.requestService();
    }
}



/*
Intermediate02:
In this question, you are required to create a UML sequence diagram by writing code in Java that follows the class diagram located at /img/sequence.diagram.png.

To complete this question, you will need to create a set of classes prefixed with Intermediate_02_ that replicate the class diagram. The diagram consists of three classes: Client, Service, and Repository.

The Client class sends a request to the Service class, which then sends a request to the Repository class to retrieve data. The Repository class returns the data to the Service class, which then returns the data to the Client class.

To recreate the sequence diagram in code, you will need to create separate classes for each of the three classes mentioned above. The Client class should have a method that sends a request to the Service class. The Service class should have a method that sends a request to the Repository class to retrieve data and a method that returns the data to the Client class. The Repository class should have a method that retrieves data.

You can use the class diagram as a guide to help you create the methods and their parameters. Once you have created the classes, you can then create a UML sequence diagram by tracing the sequence of method calls between the classes.

Note that you should aim to recreate the sequence diagram as accurately as possible, following the class diagram as closely as you can. You should also ensure that your implementation follows good coding practices, such as proper naming conventions and appropriate use of comments.


 */