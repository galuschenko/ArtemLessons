package com.company.lesson4;

public enum POSITION {
  JUNIOR(5000),
  MIDDLE(10000),
  SENIOR(15000);

  public final int minSalary;

  POSITION(int minSalary) {
    this.minSalary = minSalary;
  }
}
