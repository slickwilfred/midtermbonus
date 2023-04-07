package org.bcit.midterm.questions;

public class Basic03Main {
  public static void main(String[] args) {
    //Create a new instance of SousVideMachineWithTimer
    Basic03.SousVideMachineWithTimer sous = new Basic03.SousVideMachineWithTimer();

    //Set the target temperature
    sous.setTemperature(60.f);

    //Start the timer with a 4-second delay
    sous.startTimer(4000);
  }
}
