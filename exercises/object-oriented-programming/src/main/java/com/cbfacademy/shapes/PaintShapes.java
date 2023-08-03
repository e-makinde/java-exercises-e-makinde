package com.cbfacademy.shapes;

public class PaintShapes {
    public static void main(String[] args) {
        Rectangle deck = new Rectangle(35, 20);
        Sphere ball = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        Paint duluxPaint = new Paint(10);

        System.out.println(duluxPaint.amount(deck));
        System.out.println(duluxPaint.amount(ball));
        System.out.println(duluxPaint.amount(tank));
    }
}

