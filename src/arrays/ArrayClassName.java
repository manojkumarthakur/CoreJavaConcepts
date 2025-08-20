package arrays;

//Java Program to get the class name of array in Java
public class ArrayClassName {
    public static void main(String[] args) {
        int []arr = new int[5];
        Class c = arr.getClass();
//        Class<? extends int[]> c = arr.getClass();
        String name = c.getName();
        System.out.println("arr class name is " + name);

        //declaration and initialization of array
        int arr1[]={4,4,5};
        //getting the class name of Java array
        Class c1=arr.getClass();
        String name1=c1.getName();
        //printing the class name of Java array
        System.out.println("arr1 class name is " + name);
    }
}
