package org.bcit.midterm.questions;

//This class implements the comparable interface
public class Advanced06CoordinatePoint implements Comparable<Advanced06CoordinatePoint> {
    //Instance variables
    private int latitude;
    private int longitude;

    //Constructor
    public Advanced06CoordinatePoint(int latitude, int longitude) {
      this.latitude = latitude;
      this.longitude = longitude;
    }

  // Accessor methods for latitude and longitude
  public int getLatitude() {
    return latitude;
  }

  public int getLongitude() {
    return longitude;
  }

  // Override the equals method to check if two objects are equal
  @Override
  public boolean equals(Object obj) {
    //Check if the objects are the same reference
    if (this == obj) {
      return true;
    }
    //Check if the object is null or has a different class than this one
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    //Cast the object to the same class and compare latitude and longitude values
    Advanced06CoordinatePoint other = (Advanced06CoordinatePoint) obj;
    return latitude == other.latitude && longitude == other.longitude;
  }

  // Override the compareTo method to compare two objects based on their latitude
  @Override
  public int compareTo(Advanced06CoordinatePoint other) {
    // Calculate the distance of this point and the other point to the equator
    int thisDistance = Math.abs(this.latitude);
    int otherDistance = Math.abs(other.latitude);

    //Return 1 if this point is farther than the other point, -1 if it's closer, and 0 if they are equidistant
    if (thisDistance > otherDistance) {
      return 1;
    } else if (thisDistance < otherDistance) {
      return -1;
    } else {
      return 0;
    }
  }

  //Main method for testing
  public static void main(String[] args) {

    //Create three points
    Advanced06CoordinatePoint point1 = new Advanced06CoordinatePoint(10, 20);
    Advanced06CoordinatePoint point2 = new Advanced06CoordinatePoint(10, 20);
    Advanced06CoordinatePoint point3 = new Advanced06CoordinatePoint(30, 40);

    //Test the equals method
    System.out.println("point1 equals point2: " + point1.equals(point2)); //true
    System.out.println("point1 equals point3: " + point1.equals(point3)); //false

    //Test the compare to method
    System.out.println("point1 compareTo point2: " + point1.compareTo(point2)); //return 0
    System.out.println("point1 compareTo point3: " + point1.compareTo(point3)); //return -1
    System.out.println("point3 compareTo point1: " + point3.compareTo(point1)); //return 1

    //Test edge cases with points having negative and zero values
    Advanced06CoordinatePoint point4 = new Advanced06CoordinatePoint(-10, 20);
    Advanced06CoordinatePoint point5 = new Advanced06CoordinatePoint(10, -20);
    Advanced06CoordinatePoint point6 = new Advanced06CoordinatePoint(-30, -40);

    System.out.println("point1 equals point4: " + point1.equals(point4)); //false
    System.out.println("point1 equals point5: " + point1.equals(point5)); //true
    System.out.println("point1 compareTo point4: " + point1.compareTo(point4)); //return 0
    System.out.println("point1 compareTo point5: " + point1.compareTo(point5)); //return 0
    System.out.println("point1 compareTo point6: " + point1.compareTo(point6)); //return -1
    System.out.println("point6 compareTo point1: " + point6.compareTo(point1)); //return 1
    }
}


