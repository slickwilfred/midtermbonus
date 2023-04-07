package org.bcit.midterm.questions;

import java.time.LocalDateTime;

public class Advanced01Reminder {
    //Instance variables
    private String message;
    private LocalDateTime dateTime;

    //Constructor - creates a new reminder
    public Advanced01Reminder(String message, LocalDateTime dateTime) {
      //Initialize instance variables
      this.message = message;
      this.dateTime = dateTime;
    }

    //Accessor method
    //Returns the contents of the message instance variable
    public String getMessage() {
      return message;
    }


    //Accessor method
    //Returns the value of the datetime instance variable
    public LocalDateTime getDateTime() {
      return dateTime;
    }
}
