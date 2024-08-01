package dev.lpa;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = getRandomArray(firstArray.length);
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[firstArray.length - 1 - i];
        }
        firstArray = secondArray;
        System.out.println(Arrays.toString(firstArray));

        int[] thirdArray = getRandomArray(3);
        System.out.println(Arrays.toString(thirdArray));
        sortIntegers(thirdArray);
    }


    private static int[] getRandomArray (int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    private static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println(Arrays.toString(sortedArray));
                }
            }
        }
        return sortedArray;
    }

}

