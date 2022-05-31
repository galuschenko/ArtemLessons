package com.company.lesson2;

public class Circle implements Shape {

    double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}
