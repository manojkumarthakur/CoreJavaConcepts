package java8.methodReference.staticReference;
/*we are using predefined functional interface Runnable to refer static method.
* */
public class PredefinedRunnable {

    public static void running(){
        System.out.println("I am running");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(PredefinedRunnable::running);
//        t1.run();
        t1.start();
    }
}
