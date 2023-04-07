package org.bcit.midterm.questions;

public class Intermediate01Book extends Intermediate01Item {
  private String author;

  public Intermediate01Book(String title, double price, String author) {
    super(title, price);
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }
}