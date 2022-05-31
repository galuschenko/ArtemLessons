package com.company.lesson3;

public abstract class DancingRobot {

  public String getDefaultDanceType() {
    return "Default dance " + getDanceType1();
  }

  protected abstract String getDanceType1();
  protected abstract String getDanceType2();

}
