package problem;

import java.util.Arrays;

public class AbsoluteSort {
    static int[] absSort(int[] arr) {
        // your code goes here
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (Math.abs(arr[i]) == Math.abs(arr[j]) && (arr[i] > arr[j])){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {2, -7, -2, -2, 0};
        absSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
