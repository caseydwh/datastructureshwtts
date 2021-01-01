package com.company;
import java.util.*;

public class Main {


    public static void main(String[] args){
        int[] sumCheck = {1,3,5,9};
        findSum(sumCheck);
        checkExample();
        toPower(3,6);

    }

    public static double checkExample(){
        double[] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;

            }

        }

        System.out.println("The example output is: " + index);
        return 0;
    }
    public static double toPower(double size, double power){
        double powerOf = Math.pow(size, power);
        System.out.println("Size: 3, Power: 6: " + powerOf);
        return 0;
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("The sum is: " + sum);
        return sum;
    }
}

