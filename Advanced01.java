package org.bcit.midterm.questions;


public class Advanced01 {

}
/*


This question tests my understanding of the Singleton design pattern. The Singleton design pattern ensures that only one instance is created in the lifetime of an
application by using a private constructor that prevents instantiation from other classes. It also uses a static method that returns the single instance of the class.

Advanced01:
You are working on a project to build a calendar application that allows users to manage their schedules in real-time.
One of the requirements is to ensure that only one instance of the calendar service is created throughout the lifetime of the application.
To achieve this, you decide to implement a Singleton pattern.

Your task is to create a class called CalendarService that implements the Singleton pattern. The class should have two instance variables - appointments and reminders,
 both of which are initially empty lists.

When a user schedules an appointment, the appointment details should be added to the appointments list, along with the date, time, and participants.
When a reminder is set, it should be added to the reminders list, along with the reminder message, date, and time.

In addition to these basic functionalities, the CalendarService class should also provide methods to:

Cancel an appointment by removing the appointment details from the appointments list.
Retrieve a list of all appointments scheduled, sorted by date and time.
Retrieve a list of all reminders set, sorted by date and time.

Write a test class that thoroughly tests the CalendarService Singleton, including testing for the correctness of the state after the various methods are called,
and the proper mutation of the state over time. The test class should include test cases for all the methods in the CalendarService class, and should ensure that the Singleton pattern is properly implemented and working as expected.


 */