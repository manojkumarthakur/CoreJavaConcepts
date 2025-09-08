package concept.copy;
class Rectangle implements Cloneable{
    int length = 5;
    int breadth = 3;

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

/*
* Shallow copy - The shallow copy only creates a new reference and points to the same object. Example - For Shallow copy, we can do this by -
if we change the values in shallow copy then they affect the other reference as well.
 * */
public class ShallowCopy {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        //Shallow Copy
        Rectangle obj2 = obj1;

        System.out.println(" Before Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

        //Changing the values for object1.
        obj1.length = 10;
        obj1.breadth = 20;

        // The values are  changed for the Obj2
        System.out.println("\n After Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

    }
}
