package interviewQuestions;

import java.util.Arrays;

public class ShiftLeftByNinArray {

    public static int[] shiftLeftByN(int n, int[] arr ) {
        int len = arr.length;
        int[] shiftArray = new int[len];

        for (int i = 0; i < len; i++) {
            shiftArray[i] = arr[(i+n)%len];
        }
        return shiftArray;
    }
    public static void main(String[] args) {
        int[] arr = {19,23,3,2,45,6,7};
        System.out.println(Arrays.toString(shiftLeftByN(3, arr)));
    }
}
