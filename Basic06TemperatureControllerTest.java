package org.bcit.midterm.questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Basic06TemperatureControllerTest {


    //Test the increase temperature method
    private static void testIncreaseTemperature() {
      //Create a new controller object
      Basic05TemperatureController controller = new Basic05TemperatureController();

      //Try to increase the temperature by 10 - if it works, print
      //If it fails - transfer control to the catch block to handle the error exception
      try {
        //Call the increase temperature method on the controller object
        controller.increaseTemperature(10);
        System.out.println("The increase temperature method passed the test: " + (controller.checkTemperature() == 30));
      } catch (Basic05TemperatureControllerNotWorkingException | Basic05TemperatureOutOfRangeException e) {
        System.out.println("The increase temperature test failed: " + e.getMessage());
      }
    }

    //Test the decrease temperature method
    private static void testDecreaseTemperature() {
      Basic05TemperatureController controller = new Basic05TemperatureController();

      try {
        //Call the decrease temperature method on the controller object
        controller.decreaseTemperature(15);
        System.out.println("The decrease temperature method passed the test: " + (controller.checkTemperature() == 5));
      } catch (Basic05TemperatureControllerNotWorkingException | Basic05TemperatureOutOfRangeException e) {
        System.out.println("The decrease temperature test failed: " + e.getMessage());
      }
    }


    //Test the check temperature method
    private static void testCheckTemperature() {
      Basic05TemperatureController controller = new Basic05TemperatureController();

      try {
        System.out.println("The check temperature method passed the test: " + (controller.checkTemperature() == 20));
      } catch (Basic05TemperatureControllerNotWorkingException e) {
        System.out.println("The check temperature test failed: " + e.getMessage());
      }
    }

    //Test the controller not working exception
    private static void testTemperatureControllerNotWorkingException() {
      Basic05TemperatureController controller = new Basic05TemperatureController();
      controller.setWorking(false);

      try {
        controller.increaseTemperature(10);
        System.out.println("The temperature controller exception failed the test");
      } catch (Basic05TemperatureControllerNotWorkingException | Basic05TemperatureOutOfRangeException e) {
        System.out.println("The temperature controller exception passed the test: " + e.getMessage());
      }
    }

    //Test the temperature out of range exception
    private static void testTemperatureOutOfRangeException() {
      Basic05TemperatureController controller = new Basic05TemperatureController();

      try {
        controller.increaseTemperature(60);
        System.out.println("The temperature out of range exception failed the test");
      } catch (Basic05TemperatureControllerNotWorkingException | Basic05TemperatureOutOfRangeException e) {
        System.out.println("The temperature out of range exception passed the test: " + e.getMessage());
      }
    }


    //Run the tests
    public static void main(String[] args) {
      testIncreaseTemperature();
      testDecreaseTemperature();
      testCheckTemperature();
      testTemperatureControllerNotWorkingException();
      testTemperatureOutOfRangeException();
    }


}

/*
This tests my ability to make tests, just like the original question.
 */