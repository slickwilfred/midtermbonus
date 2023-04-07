package org.bcit.midterm.questions;

public abstract class Intermediate04NoContactSport {
  String sport;
  String location;
  int salary;

  public Intermediate04NoContactSport(String sport, String location, int salary) {
    this.sport = sport;
    this.location = location;
    this.salary = salary;
  }

  public abstract void celebration();

}

