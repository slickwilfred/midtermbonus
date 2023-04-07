package org.bcit.midterm.questions;

public class Basic05TemperatureControllerNotWorkingException extends Exception {


  //This class extends the exception class
  //Its purpose is to handle situations when the temperature controller isn't working
  //Constructor - takes a string message argument
  //It passes the message the constructor of the exception class using the super keyword
  public Basic05TemperatureControllerNotWorkingException(String message){
    super(message);
  }

}


