package org.bcit.midterm.questions;

public class Intermediate03WebServer {
  private Intermediate03ApplicationServer applicationServer;

  public Intermediate03WebServer(Intermediate03ApplicationServer applicationServer) {
    this.applicationServer = applicationServer;
  }

  public void processRequest(String request) {
    applicationServer.handleRequest(request);
  }
}