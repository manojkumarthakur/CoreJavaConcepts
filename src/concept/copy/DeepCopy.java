package concept.copy;

/*
Deep Copy - In a deep copy, we create a new object and copy the old object value to the new object.
* Now, if we change the code to deep copy, then there will be no effect on object2 if it is of type deep copy.
The clone() will do this deep copy internally and return a new object. And to do this we need to write only 1 line of code. That is - Rectangle obj2 = obj1.clone();
* */
public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Rectangle obj1 = new Rectangle();
        //Deep Copy
        Rectangle obj2 = new Rectangle();
        obj2.length = obj1.length;
        obj2.breadth = obj1.breadth;

        System.out.println(" Before Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

        //Changing the values for object1.
        obj1.length = 10;
        obj1.breadth = 20;

        // The values are not changed for the Obj2
        System.out.println("\n After Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);
        
//The Rectangle class must be modified to implement the Cloneable interface and override the clone() method.
        Rectangle obj3 = (Rectangle)obj1.clone();

    }
}
