package org.bcit.midterm.questions;

public class Intermediate02Service {
  Intermediate02Repository repository;

  public Intermediate02Service() {
    repository = new Intermediate02Repository();
  }

  public String requestData() {
    return repository.fetchData();
  }
}