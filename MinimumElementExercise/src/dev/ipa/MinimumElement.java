package dev.ipa;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    // write code here

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static int[] readElements (int count) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int [count];
        for (int i = 0; i < array.length; i++) {
            int number = sc.nextInt();
            array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] num) {
        Arrays.sort(num);
        return num[0];
    }
}