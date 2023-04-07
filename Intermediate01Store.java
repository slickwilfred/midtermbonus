package org.bcit.midterm.questions;

import java.util.ArrayList;
import java.util.List;

public class Intermediate01Store {
  private List<Intermediate01Item> inventory;

  public Intermediate01Store() {
    inventory = new ArrayList<>();
  }

  public void addItem(Intermediate01Item item) {
    inventory.add(item);
  }

  public List<Intermediate01Item> getInventory() {
    return inventory;
  }
}
