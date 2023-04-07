package org.bcit.midterm.questions;

public class Intermediate03BackEnd {
  private Intermediate03Database database;

  public Intermediate03BackEnd(Intermediate03Database database) {
    this.database = database;
  }

  public void processRequest(String request) {
    database.retrieveData(request);
  }
}