package org.bcit.midterm.questions;

public class Intermediate02Client {
  Intermediate02Service service;

  public Intermediate02Client() {
    service = new Intermediate02Service();
  }

  public void requestService() {
    String data = service.requestData();
    System.out.println("Received Data: " + data);
  }
}