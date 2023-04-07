package org.bcit.midterm.questions;

public abstract class Intermediate01Item {
  protected String title;
  protected double price;

  public Intermediate01Item(String title, double price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }
}