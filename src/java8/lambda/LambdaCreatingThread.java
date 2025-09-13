package java8.lambda;

public class LambdaCreatingThread {
    public static void main(String[] args) {

        //Thread Example without lambda
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();

//Thread Example with lambda
        Runnable r2=()->{
            System.out.println("Thread2 is running...");
        };
        Runnable r = () -> System.out.println("Thread2 is running...");
        Thread t2 = new Thread(r);
        t2.start();

    }
}
