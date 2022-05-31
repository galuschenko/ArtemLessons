package com.company.lesson2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 2);
        System.out.println("I'm Circle, my radius is: " + circle.radius + ", so my square is: " + circle.getSquare());
        System.out.println(String.format("I'm Rectangle, my sides are %s and %s, so my square is %s", rectangle.a, rectangle.b, rectangle.getSquare()));
    }
}
