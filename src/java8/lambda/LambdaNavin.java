package java8.lambda;


@FunctionalInterface
interface A {
    public void show();
}

//implementing A using normal class
class AB implements A {
    public void show() {
        System.out.println("Hi concrete class");
    }
}

public class LambdaNavin {
    public static void main(String[] args) {
        //using implementation of A using normal class
        A obj = new AB();
        obj.show();

        //using implementation of A using anonymous inner class
        A obj1 = new A(){
            public void show() {
                System.out.println("Hi I'm anonymous inner class");
            }
        };
        obj1.show();

        //using implementation of A using Lambda inner class,
        // basically removing compiler provided syntax from inner class
        /*
        * new A(){
            public void show
        * */
        A obj2 = () -> {
                System.out.println("Hi I'm using Lambda replacement from anonymous inner class");
            }
        ;
        obj2.show();
    }

}
