package org.bcit.midterm.questions;

public class Intermediate04Golf extends Intermediate04NoContactSport implements Intermediate04Swing {

  public Intermediate04Golf(String sport, String location, int salary) {
    super(sport, location, salary);
  }

  @Override
  public void celebration() {
    System.out.println("Golfer slow claps");
  }

  @Override
  public void swing() {
    System.out.println("Golfer swings for the green");
  }
}

