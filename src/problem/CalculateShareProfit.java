package problem;

/*
* Given the share price find the max profit
* 7,1,2,4,5,6,3
* max profit = 6-1 = 5
* not 7-1 =6 as 7 will be cost price
* */

public class CalculateShareProfit {
    public static int getMaxProfit(int[] arr) {
        int maxProfit =0;
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                max = arr[i];
            }
            if(arr[i]> max) {
                max = arr[i];
            }
        }
        maxProfit = max - min;
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,2,4,5,6,3, 7};
        System.out.println(getMaxProfit(arr));
    }
}