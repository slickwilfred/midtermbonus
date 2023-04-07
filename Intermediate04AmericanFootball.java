package org.bcit.midterm.questions;

public class Intermediate04AmericanFootball extends Intermediate04ContactSport implements Intermediate04Tackle {


  public Intermediate04AmericanFootball(String sport, String location, int salary) {
    super(sport, location, salary);
  }

  @Override
  public void celebration() {
    System.out.println("American football player celebrates with a chest bump");
  }

  @Override
  public void tackle() {
    System.out.println("American football player closeline tackles opponent");

  }
}


