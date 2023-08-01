package com.cbfacademy;

public class App {
    public static void main(String[] args) {

        float operand1 = 10.0F;
        float operand2 = 12.0F;

        ArithmeticExercises exercises = new ArithmeticExercises();

        System.out.println(exercises.addFloat(operand1, operand2));
        System.out.println(exercises.subtractFloat(operand1, operand2));
        System.out.println(exercises.multiplyFloat(operand1, operand2));
        System.out.println(exercises.divideFloat(operand1, operand2));
    }
}
