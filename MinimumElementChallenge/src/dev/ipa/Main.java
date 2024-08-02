package dev.ipa;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers divided with ',' to reverse the order");
        System.out.print(Arrays.toString(reverseArray(readIntegers(sc.nextLine()))));
        System.out.println("\nPlease enter numbers divided with ',' to display the Array");
        System.out.println(Arrays.toString(readIntegers(sc.nextLine())));
        System.out.println("\nPlease enter numbers divided with ',' to order the Array");
        System.out.println(Arrays.toString(reverseArray(readIntegers(sc.nextLine()))));
    }

    private static int[] readIntegers(String ceva) {
        String[] splitArray = ceva.split(",");
        int[] array = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }

        return array;
    }

    private static int[] reverseArray(int[] array) {
        Arrays.sort(array);
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        int min = array[0];
        return min;
    }
}
