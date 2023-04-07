package org.bcit.midterm.questions;

public class Intermediate06Comparable implements Comparable<Intermediate06Comparable> {
  private int x;

  public Intermediate06Comparable(int x) {
    this.x = x;
  }


  //Override method from the comparable interface
  //Takes an object as an argument
  @Override
  public boolean equals(Object obj) {
    //Check if both objects are the same
    if (this == obj){
      //If they are the same - return true
      return true;
    }
    //Checks if the object is null or not of the same class
    if (obj == null || getClass() != obj.getClass()) {
      //if either condition is met - return false
      return false;
    }
    //Cast the object to this class
    Intermediate06Comparable other = (Intermediate06Comparable) obj;
    //Checks if the x values of both objects are equal
    return x == other.x;
  }

  //Override the compare to method - takes an object of the same class as input
  @Override
  public int compareTo(Intermediate06Comparable other) {
    //compares the values of this object with the inputted object
    return Integer.compare(this.x, other.x);
  }

  public static void main(String[] args) {
    //Create 3 new objects
    Intermediate06Comparable a = new Intermediate06Comparable(5);
    Intermediate06Comparable b = new Intermediate06Comparable(5);
    Intermediate06Comparable c = new Intermediate06Comparable(8);

    //Test the equals method
    System.out.println("a equals b: " + a.equals(b)); //true
    System.out.println("a equals c: " + a.equals(c)); //false

    //Test the compare to method
    System.out.println("a compareTo b: " + a.compareTo(b)); //return 0
    System.out.println("a compareTo c: " + a.compareTo(c)); //return -1
  }
}

