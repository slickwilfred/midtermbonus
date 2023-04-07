package org.bcit.midterm.questions;

//Class that measures the humidity inside the greenhouse
public class Basic02HumiditySensor {
  //Variables for humidity and ideal humidity
  double humidity;
  double goalHumidity;

  //HumiditySensor constructor
  public Basic02HumiditySensor(){
    this.humidity = 29;
    this.goalHumidity = 25.5;
  }

  //Humidity accessor - returns the value of the humidity instance variable
  //Allows other classes to have access to the value of the instance variable
  public double getHumidity() {
    return humidity;
  }

  //Humidity mutator - sets the value of the humidity instance variable
  //Allows other classes to set the value of the instance variable
  public void setHumidity(double humidity) {
    this.humidity = humidity;
  }
}
