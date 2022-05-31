package com.company.lesson3;

public class JazzDancingRobot extends DancingRobot{

  @Override
  public String getDefaultDanceType() {
    return getDanceType2();
  }

  @Override
  protected String getDanceType1() {
    return "Jazz Dancing 1";
  }

  @Override
  protected String getDanceType2() {
    return "Jazz Dancing 2";
  }
}
