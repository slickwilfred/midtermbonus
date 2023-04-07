package org.bcit.midterm.questions;


public class Basic02 {
  //Instance variables - class instances that represents a temperature sensor, humidity sensor, and an air conditioner
  Basic02TemperatureSensor tSensor;
  Basic02HumiditySensor hSensor;
  Basic02AirConditioner ac;

  //Basic02 Constructor - creating new instances of other classes

  public Basic02 (){
    //Initialize the instances of the classes
    tSensor = new Basic02TemperatureSensor();
    hSensor = new Basic02HumiditySensor();
    ac = new Basic02AirConditioner();
  }
  //Class that adjusts the temperature and humidity
  //Calls the method that prints the temperature and humidity
  public void adjustTempAndHumid(){
    //Calls the set temperature and set humidity methods of the ac object
    //uses the two sensor instances to properly set temp/humidity
    //Calls the printTempAndHumid method to print the temp/humidity
    ac.setTemperature(tSensor);
    ac.setHumidity(hSensor);
    printTempAndHumid();


  }

  //Method that prints the temp/humidity
  public void printTempAndHumid(){
    //"\033[4m" turns on the underlining, "\033[0m" turns off underlining
    System.out.println("\033[4m" + "Temperature and Humidity Checker" + "\033[0m");
    System.out.println("Current temperature: " + tSensor.getTemperature()); //gets the temperature from the temperature sensor class
    System.out.println("Current humidity: " + hSensor.getHumidity()); //gets the humidity from the humidity sensor class
  }


  //Main method
  public static void main(String[] args){
    //Create a new instance of a greenhouse
    Basic02 greenhouse = new Basic02();

    //Call method to adjust the temperature and humidity to the correct levels
    greenhouse.adjustTempAndHumid();

  }

}
/*

The first question, Basic01, and the second question, Basic02, both test the concept of creating a class with instance variables and methods to
manipulate those variables. In Basic01, the class keeps track of a team's score and whether the team has possession of the ball,
 and provides methods to add to the score and change possession. In Basic02, the class controls the temperature and humidity of a greenhouse
 through composition of three other classes: TemperatureSensor, HumiditySensor, and AirConditioner. The Basic02 class has a method to adjust
 the temperature and humidity levels and provides a main method to simulate a day in the greenhouse. Both questions also require creating
 instances of the class and testing its functionality through methods and print statements.



Basic02:
You are designing a system to control the temperature and humidity in a greenhouse. Create a new class called "Basic02" that is composed of the following three classes:
(1) "TemperatureSensor" that measures the temperature inside the greenhouse.
(2) "HumiditySensor" that measures the humidity inside the greenhouse.
(3) "AirConditioner" that regulates the temperature and humidity inside the greenhouse.

Create a method in the "Basic02" class called "adjustTemperatureAndHumidity" that:
(1) Checks the temperature and humidity levels inside the greenhouse using the "TemperatureSensor" and "HumiditySensor" classes.
(2) Calls the "setTemperature" and "setHumidity" methods on the "AirConditioner" class to adjust the temperature and humidity levels inside the greenhouse.

Create a new instance of the "Basic02" class and simulate a day in the greenhouse by adjusting the temperature and humidity multiple times. After each adjustment, print out the current temperature and humidity levels inside the greenhouse.

Note: You may modify the "Basic02", "TemperatureSensor", "HumiditySensor", and "AirConditioner" classes if you need to, but it is not required.

 */