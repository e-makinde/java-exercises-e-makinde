package com.cbfacademy.shapes;

import java.lang.Math;

public class Cylinder extends Shape {
    protected double radius;
    protected double height;


    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        shapeName = "Cylinder";
    }

    @Override
    public double area() {
        return (height * Math.PI * (Math.pow(radius,2)));
    }
}