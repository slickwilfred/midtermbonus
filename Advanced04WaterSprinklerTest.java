package org.bcit.midterm.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Advanced04WaterSprinklerTest {

  //This test method tests the water sprinkler class
  @Test
  public void testWaterSprinkler() {
    //Create a new sprinkler object with a range of 5 and a 90 degree angle
    Advanced04WaterSprinkler sprinkler = new Advanced04WaterSprinkler(5, 90);
    //Test that the range and angle are set up properly by using accessor methods
    assertEquals(5, sprinkler.getRange());
    assertEquals(90, sprinkler.getAngle());

    //Use mutator methods to change the range and angle to 10 and 180
    sprinkler.setRange(10);
    sprinkler.setAngle(180);
    assertEquals(10, sprinkler.getRange());
    assertEquals(180, sprinkler.getAngle());
  }


  //This test method tests the circular area class
  @Test
  public void testCircularArea() {
    //Create a new sprinkler object
    Advanced04WaterSprinkler sprinkler = new Advanced04WaterSprinkler(5, 90);

    //Create a new circular area object
    Advanced04CircularArea area = new Advanced04CircularArea(10, 0, 0);

    //Calculate the area that the sprinkler object covers in the area object
    double coveredArea = area.coveredArea(sprinkler);

    //Test that the area equals 19.63
    //Added a tolerance of 0.01 - makes it easier to compare floating point values
    assertEquals(19.63, coveredArea, 0.01);

  }
}