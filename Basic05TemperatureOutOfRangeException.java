package org.bcit.midterm.questions;

public class Basic05TemperatureOutOfRangeException extends Exception {


  //This class extends the exception class
  //Its purpose is to handle situations when the temperature is outside of the range
  //Constructor - takes a string message argument
  //It passes the message the constructor of the exception class using the super keyword
    public Basic05TemperatureOutOfRangeException(String message){
      super(message);

    }


}
