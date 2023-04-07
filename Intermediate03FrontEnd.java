package org.bcit.midterm.questions;

public class Intermediate03FrontEnd {
  private Intermediate03WebServer webServer;

  public Intermediate03FrontEnd(Intermediate03WebServer webServer) {
    this.webServer = webServer;
  }

  public void processRequest(String request) {
    webServer.processRequest(request);
  }
}