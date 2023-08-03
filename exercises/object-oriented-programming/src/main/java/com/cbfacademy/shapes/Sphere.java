package com.cbfacademy.shapes;

import java.lang.Math;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        shapeName = "sphere";
    }


    @Override
    public double area() {
        return (4 * Math.PI * (Math.pow(radius,2)));
    }
}