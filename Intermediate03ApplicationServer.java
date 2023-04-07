package org.bcit.midterm.questions;

public class Intermediate03ApplicationServer {
  private Intermediate03BackEnd backEnd;

  public Intermediate03ApplicationServer(Intermediate03BackEnd backEnd) {
    this.backEnd = backEnd;
  }

  public void handleRequest(String request) {
    backEnd.processRequest(request);
  }
}