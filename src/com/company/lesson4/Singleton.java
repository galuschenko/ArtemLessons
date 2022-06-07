package com.company.lesson4;

public class Singleton {
//  private static Singleton instance;

  public static final Singleton INSTANCE = new Singleton();

  private Singleton() {

  }

//  public static Singleton getInstance() {
//    if (instance == null) {
//      instance = new Singleton();
//    }
//    return instance;
//  }
}
