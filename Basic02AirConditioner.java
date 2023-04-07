package org.bcit.midterm.questions;

//Class that turns on/off AC
public class Basic02AirConditioner {
    //Instance variable
    boolean acOn;

    //Constructor - initialize the acOn variable to false
    //The AC unit will be off to start
    public Basic02AirConditioner(){
      this.acOn = false;
    }

    //Method to set teh temperature
    //SetTemperature method takes the tsensor object as an argument
    public void setTemperature(Basic02TemperatureSensor tSensor){
      if (tSensor.getTemperature() > tSensor.goalTemp){
        System.out.println("\033[4m" +"Above ideal temperature - air conditioning activated" + "\033[0m");

      }
      while (tSensor.getTemperature() > tSensor.goalTemp){
        acOn = true;
        tSensor.setTemperature(tSensor.getTemperature() - 1);
        System.out.println("Temperature has decreased by 1 degree");
      }
      acOn = false;
      System.out.println("Ideal temperature reached - air conditioning deactivated\n\n");

    }

    //Method to set the humidity
    //Takes the Basic02HumiditySensor object as an argument
    public void setHumidity (Basic02HumiditySensor hSensor) {
      //If the hsensors humidity is above the hsensors goal humidity
      //Need to modify the humidity
      //Put this if statement above the while loop so it's only printed once
      if(hSensor.getHumidity() > hSensor.goalHumidity){
        System.out.println("\033[4m" +"Above ideal humidity - air conditioning activated" + "\033[0m");

      }
      //Flip acOn to true so the AC unit activates and changes the humidity
      //Decreases the temperature by 0.5 degrees
      //Once the while loop condition is satisfied, the AC unit is turned off
      while (hSensor.getHumidity() > hSensor.goalHumidity){
        acOn = true;
        hSensor.setHumidity(hSensor.getHumidity() - 0.5);
        System.out.println("Humidity decreased by 0.5 degrees");
      }
      acOn = false;
      System.out.println("Ideal humidity reached - air conditioning deactivated\n\n");
    }

}
