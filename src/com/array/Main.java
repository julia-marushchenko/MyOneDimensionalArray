// Java program to demonstrate one dimensional array
package com.array;

import java.util.Random;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating the array of integers with eleven elements
        int [] array = new int [11];

        // Filling the array with random numbers
        for (int index = 0; index < array.length; index++){
            array [index] = new Random().nextInt();
        }

        // Printing elements of the array to the console
        System.out.print("[ ");
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.print(" ]");
    }
}