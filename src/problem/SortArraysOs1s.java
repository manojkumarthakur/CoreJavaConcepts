package problem;

import java.util.Arrays;

/*
 * Sort an array of 0s, 1s and 2s - Dutch National Flag Problem
 * https://www.geeksforgeeks.org/dsa/sort-an-array-of-0s-1s-and-2s/
 * */
public class SortArraysOs1s {
    static void sort012(int[] arr) {
        // standard sorting function
        Arrays.sort(arr);
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sortUsingCount(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;

        for (int i : arr) {
            if (i == 0) {
                c0++;
            } else if (i == 1) {
                c1++;
            } else if (i == 2) {
                c2++;
            }
        }
        for (int i = 0; i < c0; i++) {
            arr[i] = 0;
        }
        for (int i = c0; i <c0+c1 ; i++) {
            arr[i] = 1;
        }
        for (int i = c0 + c1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 2, 2, 0};
//        bubbleSort(arr);
//        sort012(arr);
        sortUsingCount(arr);
        System.out.println(Arrays.toString(arr));
    }

}
