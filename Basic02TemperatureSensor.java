package org.bcit.midterm.questions;


//Class that measures the temp inside greenhouse
public class Basic02TemperatureSensor {

    //Instance variables
    double temperature;
    double goalTemp;

    //TemperatureSensor constructor
    public Basic02TemperatureSensor(){
      //Initialize the instance variables
      this.temperature = 30;
      this.goalTemp = 26;
    }

    //Temperature accessor - returns the current value of the temperature instance variable
    //Allows other classes to have access to the current temperature
    public double getTemperature(){
      return temperature;
    }

    //Temperature mutator - allows other classes to set the temperature instance variable
    //Allows other classes to set the temperature
    public void setTemperature(double temperature){
      this.temperature = temperature;
    }

}
