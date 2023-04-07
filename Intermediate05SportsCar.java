package org.bcit.midterm.questions;

public class Intermediate05SportsCar extends Intermediate05Car implements Intermediate05Acceleratable, Intermediate05Deceleratable {
  public Intermediate05SportsCar(String name, int speed) {
    super(name, speed);
  }

  @Override
  public void accelerate() {
    System.out.println("The sports car " + name + " accelerates.");
    speed += 20;
  }

  @Override
  public void decelerate() {
    System.out.println("The sports car " + name + " decelerates.");
    speed -= 10;
  }
}