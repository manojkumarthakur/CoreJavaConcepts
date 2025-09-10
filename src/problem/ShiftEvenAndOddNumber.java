package problem;

import java.util.Arrays;

public class ShiftEvenAndOddNumber {
    public static void shift(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 ==0)
                continue;
            for (int j = arr.length-1; j >=0; j--) {
                if(arr[i]%2!=0 && arr[j]%2 !=1) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
    static void shiftEvenOdd(int[] arr) {
        int left = 0, right = arr.length -1;

        while(left<right){
            while (left<right && arr[left]%2==0) {
                left++;
            }
            while (left<right && arr[right]%2==1) {
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,5,8,7,1,3,6,4,5,9};
//        shift(arr);
        shiftEvenOdd(arr);
        System.out.println(Arrays.toString(arr));

    }
}
