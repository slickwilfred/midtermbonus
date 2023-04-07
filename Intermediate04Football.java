package org.bcit.midterm.questions;

public class Intermediate04Football extends Intermediate04ContactSport implements Intermediate04Tackle {
  public Intermediate04Football(String sport, String location, int salary) {
    super(sport, location, salary);
  }

  @Override
  public void celebration() {
    System.out.println("Football player does a celebratory dance after a goal");
  }

  @Override
  public void tackle() {
    System.out.println("Football player slide tackles");
  }
}

