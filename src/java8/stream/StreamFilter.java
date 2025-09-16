package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Java Stream.filter() Method
The filter() method is an intermediate operation that takes a Predicate (a functional interface) as an argument. A Predicate is a functional interface with a single abstract method, test, which returns a boolean value. The filter() method processes each element of the stream and includes it in the result only if the Predicate evaluates to true.

Signature
The signature of Stream filter() method is given below:

Stream<T> filter(Predicate<? super T> predicate)
Parameter
predicate: It takes Predicate reference as an argument. Predicate is a functional interface. So, we can also pass lambda expression here.

Return
It returns a new stream.
* */
public class StreamFilter {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        List<Float> pricesList = productsList.parallelStream()
                .filter(p -> p.price > 30000)   // filtering price
                .map(pm -> pm.price)          // fetching price
                .collect(Collectors.toList());
        System.out.println(pricesList);
    }
}
