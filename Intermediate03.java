package org.bcit.midterm.questions;

public class Intermediate03 {


    public static void main(String[] args) {
      Intermediate03Database database = new Intermediate03Database();
      Intermediate03BackEnd backEnd = new Intermediate03BackEnd(database);
      Intermediate03ApplicationServer applicationServer = new Intermediate03ApplicationServer(backEnd);
      Intermediate03WebServer webServer = new Intermediate03WebServer(applicationServer);
      Intermediate03User user = new Intermediate03User();

      // Simulating a user sending a request
      String request = "Get User Information";
      user.sendRequest(webServer, request);
    }
}



/*
This question tests my understanding of communication diagrams.


Intermediate03
The Intermediate_03_CommunicationDiagram question requires you to create a UML Communication Diagram and implement it in code. The diagram can be found in the /img/communication.diagram.png file.

To complete this question, you will need to do the following:

Create a new class for each of the actors and components represented in the diagram. Prefix each class with Intermediate_03_.
Implement the diagram by creating instances of the appropriate classes and connecting them with arrows to represent communication.
Write a main method that demonstrates the communication between the actors and components as indicated in the diagram.
The diagram itself shows a simplified system that consists of four actors: the user, the web server, the application server, and the database. The system also includes three components: the front-end, the back-end, and the database.

To implement the diagram, you would create the following classes:

Intermediate_03_User
Intermediate_03_WebServer
Intermediate_03_ApplicationServer
Intermediate_03_Database
Intermediate_03_FrontEnd
Intermediate_03_BackEnd
You would then create instances of these classes and connect them with arrows to show the communication between the actors and components. The arrows would indicate the flow of information between the different components of the system.




 */