package org.bcit.midterm.questions;

public class Basic03 {
  double waterLevel; //The water level inside the machine
  float targetTemperature; //Target temperature for the food being cooked
  float currTemperature; //Current temperature inside the machine

  //Basic03 constructor
  public Basic03() {
    this.waterLevel = waterLevel;
    this.targetTemperature = 60.0f;
    this.currTemperature = 20.0f;
  }

  //Method to set the target temperature, increasing the current temperature by 5 degrees every minute
  public void setTemperature(float targetTemperature) {
    //New thread
    //In Java, you can have multiple threads to perform tasks as the same time
    //The threat waits for 10 seconds before increasing the temperature
    new Thread(() -> {
      while (currTemperature < targetTemperature) {
        //New try block to handle exceptions that may occur during program execution
        try {
          Thread.sleep(3000); //Wait for 3-seconds before doing anything
        } catch (InterruptedException e) {
          //If an interruption exception occurs with the Thread.sleep() method
          //The catch block will handle the error

          e.printStackTrace(); //Prints the stack trace of the exception - helps with debugging
        }
        currTemperature += 5.0f; //Increase current temperature by 5 degrees
        System.out.println("Current temperature increased by 5 degrees after one minute");
        System.out.println("Current temperature: " + currTemperature + " degrees");

        if (currTemperature == targetTemperature){
          System.out.println("Target temperature reached: " + currTemperature + " degrees");
        }
      }
    }).start(); //Start the thread
  }

  // Getter for the target temperature
  public float getTemperature() {
    return targetTemperature;
  }

  //Timer class as a child of Basic03
  public static class Timer {
    private long start; // Time at the beginning of the Timer
    private static Timer instance; // Singleton instance of Timer

    //Private Timer constructor
    private Timer() {
      //Initialize the start variable with the current system time in nanoseconds
      start = System.nanoTime();  }

    //Method to get the singleton instance of Timer
    //Only want one timer instance
    public static synchronized Timer getInstance() {
      if (instance == null) {
        instance = new Timer(); //Create a new Timer if the instance is null
      }
      return instance;
    }


  }

  //SousVideMachineWithTimer class, which extends Basic03
  public static class SousVideMachineWithTimer extends Basic03 {
    //Instance variable - Timer instance
    Timer timer;

    //SousVideMachineWithTimer constructor
    public SousVideMachineWithTimer() {
      timer = Timer.getInstance(); // Get the Timer singleton instance
    }

    //Method to start the timer with a specified delay
    public void startTimer(long delay) {
      //Start a new thread
      new Thread(() -> {
        try {
          Thread.sleep(delay); //Delay is entered when running the method
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Current machine temperature: " + targetTemperature);
      }).start();
    }
  }
}
/*


This question tests the concept of inheritance in object-oriented programming.
In the first question, the sousvide machine with timer class extends the basic03 class, adding new functionality while also using the existing
functionality from the parent class. Similarly to the original question, this question requires the creation of a
subclass that extends a parent class, adding new functionality while using the existing functionality from the parent class.





You are designing a system to control the temperature of a sous-vide machine. Create a new class called "Basic03" that has the following two attributes:
(1) "waterLevel" that represents the water level inside the machine.
(2) "targetTemperature" that represents the desired temperature for the food being cooked.

Define a method in the "Basic03" class called "setTemperature" that takes a float argument and sets the "targetTemperature" attribute to that value.

Create a subclass of the "Basic03" class called "SousVideMachineWithTimer" that extends the "Basic03" class by adding a new core functionality:
starting a timer for cooking food at some point in the future.
You MUST NOT recreate any functionality that the parent class already implements. You MUST use the parent class.

Define a method in the "SousVideMachineWithTimer" class called "startTimer" that takes a long argument and starts a timer for cooking the food at
the desired temperature after that many milliseconds.

Create a new instance of the "SousVideMachineWithTimer" class and simulate cooking a meal by setting the temperature
and starting a timer. After the timer goes off, print out the current temperature inside the machine.

Note: You may modify the "SousVideMachine" and "SousVideMachineWithTimer" classes if you need to, but it is not required.

 */