package arrays;

/*In Java, arrays implement the Cloneable interface, allowing us to create clones of arrays. If we create a clone of a single-dimensional array, it creates a deep copy of the Java array. It means it will copy the actual value. But, if we create the clone of a multidimensional array, it creates a shallow copy of the Java array, which means it copies the references.

This distinction is important because modifying elements in a shallow copied multidimensional array will affect both the original and cloned arrays, while in a deep copied single-dimensional array, modifications will not impact the original.*/
//Java Program to clone the array
class TestarrayClone {
    public static void main(String args[]) {
        int arr[] = {33, 3, 4, 5};
        System.out.println("Printing original array:");
        for (int i : arr)
            System.out.println(i);
        System.out.println("Printing clone of the array:");
        int carr[] = arr.clone();
        for (int i : carr)
            System.out.println(i);
        System.out.println("Are both equal?");
        System.out.println(arr == carr);

//       In a deep copied single-dimensional array, modifications will not impact the original.
        carr[0] = 100;
        System.out.println(arr[0]);
        System.out.println(carr[0]);
    }
}