package com.algo.bubble;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class BubbleSort {
    BubbleSort() {
    }

    public static void main(String[] arrstring) {
        int totNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers to be sorted");
        int totalNum = sc.nextInt();
        int[] inputArray = new int[totalNum];
        System.out.println("Enter your list of" + totalNum + " integers");
        
        for (totNumber = 0; totNumber < totalNum; ++totNumber) {
            inputArray[totNumber] = sc.nextInt();
        }
        
        for (totNumber = 0; totNumber < totalNum - 1; ++totNumber) {
            for (int i = 0; i < totalNum - totNumber - 1; ++i) {
                if (inputArray[i] <= inputArray[i + 1]) continue;
                int n3 = inputArray[i];
                inputArray[i] = inputArray[i + 1];
                inputArray[i + 1] = n3;
            }
        }
        System.out.println("List of numbers sorted using BubbleSort");
        for (totNumber = 0; totNumber < totalNum; ++totNumber) {
            System.out.print(inputArray[totNumber] + " ");
        }
    }
}