package com.cbfacademy.shapes;

public abstract class Shape {
    protected String shapeName;

    public abstract double area();

    public String toString() {
        return this.shapeName;
    }
}