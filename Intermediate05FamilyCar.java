package org.bcit.midterm.questions;

public class Intermediate05FamilyCar extends Intermediate05Car implements Intermediate05Acceleratable, Intermediate05Deceleratable {
  public Intermediate05FamilyCar(String name, int speed) {
    super(name, speed);
  }

  @Override
  public void accelerate() {
    System.out.println("The family car " + name + " accelerates.");
    speed += 10;
  }

  @Override
  public void decelerate() {
    System.out.println("The family car " + name + " decelerates.");
    speed -= 5;
  }
}
