package org.bcit.midterm.questions;

public class Advanced04CircularArea {
  //Instance variables
  private double radius;
  private double centerX;
  private double centerY;


    //Constructor
    public Advanced04CircularArea(double radius, double centerX, double centerY) {
      //Initialize instance variables
      this.radius = radius;
      this.centerX = centerX;
      this.centerY = centerY;
    }

    //Calculate the area that's covered by the sprinkler
    public double coveredArea(Advanced04WaterSprinkler sprinkler) {
      return Math.PI * Math.pow(sprinkler.getRange(), 2) * (sprinkler.getAngle() / 360);
    }

}