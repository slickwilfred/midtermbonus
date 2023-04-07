package org.bcit.midterm.questions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

class Advanced01CalendarService {
  //Instance variables
  //Private static instance - returns the one instance of the Singleton design pattern
  private static Advanced01CalendarService instance;
  private ArrayList<Advanced01Appointment> appointments;
  private ArrayList<Advanced01Reminder> reminders;


  //Private constructor
  //This prevents instantiation from external classes
  private Advanced01CalendarService() {
    //Initialize instance variable arraylists
    appointments = new ArrayList<>();
    reminders = new ArrayList<>();
  }

  //This method gets the instance of the class
  //If the instance is null, an instance hasn't been created yet
  //If so, it's okay to create a new instance
  public static Advanced01CalendarService getInstance() {
    //Checks if the instance is null
    if (instance == null) {
      instance = new Advanced01CalendarService();
    }
    //Return the instance of the class
    return instance;
  }

  //This method schedules an appointment
  //It creates a new appointment and adds it to the arraylist
  //It then sorts the appointment arraylist by date and time
  //It then sorts the participants by date and time by using the Comparator
  //Comparator is a functional interface, used to compare two objects of the same type
  public void scheduleAppointment(String details, LocalDateTime dateTime, ArrayList<String> participants) {
    appointments.add(new Advanced01Appointment(details, dateTime, participants));
    appointments.sort(Comparator.comparing(Advanced01Appointment::getDateTime));
  }


  //This method sets a reminder
  //It creates a new reminder and adds it to the reminders arraylist
  //It then sorts the reminders by date and time by using the Comparator
  //Comparator is a functional interface, used to compare two objects of the same type
  public void setReminder(String message, LocalDateTime dateTime) {
    reminders.add(new Advanced01Reminder(message, dateTime));
    reminders.sort(Comparator.comparing(Advanced01Reminder::getDateTime));
  }


  //This method cancels an appointment
  //It removes the appointment from the appointment arraylist
  public void cancelAppointment(Advanced01Appointment appointment) {
    appointments.remove(appointment);
  }

  //Accessor method
  //It returns the values of the appointments arraylist instance variable
  public ArrayList<Advanced01Appointment> getAppointments() {
    return new ArrayList<>(appointments);
  }


  //Accessor method
  //It returns the values of the reminders arraylist instance variable
  public ArrayList<Advanced01Reminder> getReminders() {
    return new ArrayList<>(reminders);
  }
}
