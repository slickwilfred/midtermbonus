package org.bcit.midterm.questions;

public class Intermediate01Electronic extends Intermediate01Item {
  private String serialNumber;

  public Intermediate01Electronic(String title, double price, String serialNumber) {
    super(title, price);
    this.serialNumber = serialNumber;
  }

  public String getSerialNumber() {
    return serialNumber;
  }
}