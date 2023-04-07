package org.bcit.midterm.questions;


public class Basic05TemperatureController {
  private int temperature;
  private boolean working;

  //Constructor
  public Basic05TemperatureController() {
    //Initialize instance variables
    this.temperature = 20;
    this.working = true;
  }

  //This method increases temperature by a given value
  //Throws exceptions when it's not working
  //Throws exceptions when it's out of range
  public void increaseTemperature(int increase) throws Basic05TemperatureControllerNotWorkingException, Basic05TemperatureOutOfRangeException {
    //If the temperature controller isn't working and I try to increase the temperature
    //Throw exception
    if (!working) {
      throw new Basic05TemperatureControllerNotWorkingException("The temperature controller isn't working");

    }
    //If the temperature is outside of the range
    //Throw error exception
    if (temperature + increase > 50 || temperature + increase < -50) {
      throw new Basic05TemperatureOutOfRangeException("The temperature is outside of the range");

    }
    //If no exceptions are thrown - increase the temperature
    temperature += increase;
  }

  //This method decreases temperature by a given value
  //Throws exceptions if it isn't working or the temperature is outside of the range
  public void decreaseTemperature(int decrease) throws Basic05TemperatureControllerNotWorkingException, Basic05TemperatureOutOfRangeException {
    //If the temperature controller isn't working and I try to decrease the temperature
    //Throw exception
    if (!working) {
      throw new Basic05TemperatureControllerNotWorkingException("The temperature controller isn't working");

    }
    //If the temperature is outside of the range - throw exception
    if (temperature - decrease > 50 || temperature - decrease < -50) {
      throw new Basic05TemperatureOutOfRangeException("The temperature is outside of the range");
    }
    //If no exceptions are thrown - decrease the temperature
    temperature -= decrease;
  }

  //This method checks the temperature
  //If the temp controller isn't working - throw an exception
  //If it is working, return the value of temperature
  public int checkTemperature() throws Basic05TemperatureControllerNotWorkingException {
    if (!working) {
      throw new Basic05TemperatureControllerNotWorkingException("The temperature controller isn't working");
    }
    return temperature;
  }

  //This method changes the boolean value back and forth from working and not working
  public void setWorking(boolean working) {
    this.working = working;
  }

  public static void main(String[] args) {

    //Create a new controller object
    Basic05TemperatureController controller = new Basic05TemperatureController();


    //Testing the different methods
    //The try block contains code that might throw and exception
    //If an exception is thrown, the try block will be terminated and the control-
    //will be passed to the catch block in order to handle the exception
    try {
      controller.increaseTemperature(10);
      System.out.println("Temperature increase: " + controller.checkTemperature());
    } catch (Basic05TemperatureControllerNotWorkingException | Basic05TemperatureOutOfRangeException e) {
      System.out.println(e.getMessage());
    }

    try {
      controller.decreaseTemperature(15);
      System.out.println("Temperature decrease: " + controller.checkTemperature());
    } catch (Basic05TemperatureControllerNotWorkingException | Basic05TemperatureOutOfRangeException e) {
      System.out.println(e.getMessage());
    }

    controller.setWorking(false);

    try {
      controller.increaseTemperature(10);
      System.out.println("Temperature increase: " + controller.checkTemperature());
    } catch (Basic05TemperatureControllerNotWorkingException | Basic05TemperatureOutOfRangeException e) {
      System.out.println(e.getMessage());
    }

    try {
      controller.decreaseTemperature(15);
      System.out.println("Temperature decrease: " + controller.checkTemperature());
    } catch (Basic05TemperatureControllerNotWorkingException | Basic05TemperatureOutOfRangeException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println("Current temperature: " + controller.checkTemperature());
    } catch (Basic05TemperatureControllerNotWorkingException e) {
      System.out.println(e.getMessage());
    }
  }
}
/*
This question tests the same concepts as the original question by requiring the creation and use of custom exceptions to handle different conditions
related to the different attributes of a class. The purpose is to design methods that throw exceptions when certain conditions are met and handle these exceptions properly.


Basic05:
Consider a TemperatureController class that has an integer attribute temperature (in degrees Celsius) and a boolean attribute working.

Your task is to create two custom exceptions called TemperatureOutOfRangeException and TemperatureControllerNotWorkingException, and use them in the increaseTemperature, decreaseTemperature, and checkTemperature methods of the TemperatureController class.

Follow the specifications below to complete the task:

Create a new exception called TemperatureOutOfRangeException with a constructor that takes a message string parameter.

Create a new exception called TemperatureControllerNotWorkingException with a constructor that takes a message string parameter.

In the TemperatureController class, implement an increaseTemperature method with the following specifications:

If the method is called when working is false, throw the TemperatureControllerNotWorkingException.
If the new temperature value is outside the allowed range (-50 to 50 degrees Celsius), throw the TemperatureOutOfRangeException.
Otherwise, increase the temperature by the given value.
In the TemperatureController class, implement a decreaseTemperature method with the following specifications:

If the method is called when working is false, throw the TemperatureControllerNotWorkingException.
If the new temperature value is outside the allowed range (-50 to 50 degrees Celsius), throw the TemperatureOutOfRangeException.
Otherwise, decrease the temperature by the given value.
In the TemperatureController class, implement a checkTemperature method with the following specifications





 */