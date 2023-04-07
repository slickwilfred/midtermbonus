package org.bcit.midterm.questions;

public class Intermediate05SpeedBoat extends Intermediate05Boat implements Intermediate05Acceleratable, Intermediate05Deceleratable {
  public Intermediate05SpeedBoat(String name, int speed) {
    super(name, speed);
  }

  @Override
  public void accelerate() {
    System.out.println("The speed boat " + name + " accelerates.");
    speed += 15;
  }

  @Override
  public void decelerate() {
    System.out.println("The speed boat " + name + " decelerates.");
    speed -= 8;
  }
}
