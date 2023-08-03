package com.cbfacademy.shapes;

public class Paint {
    protected double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape shape) {
        double area = shape.area();
        return area/this.coverage;
    }
}
