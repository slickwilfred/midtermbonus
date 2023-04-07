package org.bcit.midterm.questions;

public class Intermediate04Basketball extends Intermediate04NoContactSport implements Intermediate04Shoot {

  public Intermediate04Basketball(String sport, String location, int salary) {
    super(sport, location, salary);
  }

  @Override
  public void celebration() {
    System.out.println("Basketball player flexes after a and-one");
  }

  @Override
  public void shoot() {
    System.out.println("Basketball player shoots a three-pointer");
  }
}


