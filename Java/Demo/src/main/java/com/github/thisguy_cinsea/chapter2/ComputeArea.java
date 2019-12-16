package com.github.thisguy_cinsea.chapter2;

public class ComputeArea {
    public static void main(String[] args) {
        double radius = 20;
        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
        chapter1Test();
    }

    public static void chapter1Test() {
        double i = 50;
        double k = i + 50;
        double j = k + 1;

        System.out.println("j is " + j + " and k is " + k);
    }
}
