package org.bcit.midterm.questions;

public class Intermediate03User {
  public void sendRequest(Intermediate03WebServer webServer, String request) {
    webServer.processRequest(request);
  }
}