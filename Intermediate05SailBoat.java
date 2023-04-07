package org.bcit.midterm.questions;

public class Intermediate05SailBoat extends Intermediate05Boat implements Intermediate05Acceleratable, Intermediate05Deceleratable {
  public Intermediate05SailBoat(String name, int speed) {
    super(name, speed);
  }

  @Override
  public void accelerate() {
    System.out.println("The sail boat " + name + " accelerates.");
    speed += 5;
  }

  @Override
  public void decelerate() {
    System.out.println("The sail boat " + name + " decelerates.");
    speed -= 3;
  }
}