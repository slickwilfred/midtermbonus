package org.bcit.midterm.questions;

public class Intermediate04Baseball extends Intermediate04NoContactSport implements Intermediate04Swing {
  public Intermediate04Baseball(String sport, String location, int salary) {
    super(sport, location, salary);
  }

  @Override
  public void celebration() {
    System.out.println("Baseball player celebrates and throws glove into the air");
  }

  @Override
  public void swing() {
    System.out.println("Baseball player swings for a home run");

  }
}

