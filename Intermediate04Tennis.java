package org.bcit.midterm.questions;

public class Intermediate04Tennis extends Intermediate04NoContactSport implements Intermediate04Swing{

  public Intermediate04Tennis(String sport, String location, int salary) {
    super(sport, location, salary);
  }

  @Override
  public void celebration() {
    System.out.println("Tennis player throws racket into the air after a win");
  }

  @Override
  public void swing() {
    System.out.println("Tennis player backhand swing");
  }
}


