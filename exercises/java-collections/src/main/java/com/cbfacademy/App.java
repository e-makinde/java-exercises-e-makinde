package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        int[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        float[] floatArray = new float[12];
        double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        boolean[] booleanArray = { true, true, false, true, false, false };

        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (i * 1.1F);
        }

        System.out.println(integerArray[4]);
        System.out.println(floatArray[4]);
        System.out.println(doubleArray[4]);
        System.out.println(booleanArray[4]);

        Object[][] objectsArray = { { integerArray, floatArray } };
        System.out.println(objectsArray);

    }
}
