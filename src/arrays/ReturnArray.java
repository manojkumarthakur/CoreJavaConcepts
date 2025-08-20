package arrays;

//Java Program to return an array from the method

public class ReturnArray {
    static int[] get() {
        return new int[]{10, 20, 25};
    }

    public static void main(String[] args) {
        for (int a : get()) {
            System.out.println(a);
        }
        System.out.println("---------------");
        //calling method which returns an array
        int arr[] = get();
        //printing the values of an array
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }
}
