package java8.stream;

import java.util.stream.Stream;

public class IteratingStream {
    public static void main(String[] args) {
        Stream.iterate(1, el -> el+1)
                .filter(n -> n%5==0)
                .limit(5)
                .forEach(System.out::println);
    }
}
