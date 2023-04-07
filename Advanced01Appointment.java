package org.bcit.midterm.questions;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Advanced01Appointment {
  //Instance variables
  private String details;
  private LocalDateTime dateTime;
  private ArrayList<String> participants;


  //Constructor to create a new appointment
  public Advanced01Appointment(String details, LocalDateTime dateTime, ArrayList<String> participants) {
    //Initialize instance variables
    this.details = details;
    this.dateTime = dateTime;
    this.participants = participants;
  }


  //Accessor method
  //This method returns the appointment details
  public String getDetails() {
    return details;
  }


  //Accessor method
  //This method returns the date and time of the appointment
  public LocalDateTime getDateTime() {
    return dateTime;
  }

  //Accessor method
  //Returns the contents of the participants arraylist
  public ArrayList<String> getParticipants() {
    return participants;
  }
}

