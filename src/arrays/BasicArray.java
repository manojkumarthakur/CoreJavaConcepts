package arrays;

public class BasicArray {
    public static void main(String[] args) {
        //declaration and instantiation of an array
        int[] arr = new int[5];
        arr[1] = 1; //initialization
        arr[4] = 5;
        //traversing array
        for (int i = 0; i < arr.length; i++) { //length is the property of array
            System.out.println(arr[i]);
        }
        System.out.println("---------------");

        //declaration, instantiation and initialization of an array
        int a[] = {33, 3, 4, 5};
        //traversing array
        for (int i = 0; i < a.length; i++)//length is the property of array
            System.out.println(a[i]);
        System.out.println("---------------");

//        for each loop
        for (int x:a)
            System.out.println(x);
    }
}
