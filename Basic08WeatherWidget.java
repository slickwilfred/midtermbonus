package org.bcit.midterm.questions;

import java.util.Map;

public class Basic08WeatherWidget {
  private int temperature;
  private String location;
  private double humidity;
  private boolean isRaining;
  private Map<String, Integer> weatherData;

  public int getTemperature() {
    return temperature;
  }

  public String getLocation() {
    return location;
  }

  public boolean isRainy() {
    return isRaining;
  }

  public double calculateHeatIndex(double temp, double humidity) {
    return 0;
  }
}

