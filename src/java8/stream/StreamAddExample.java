package java8.stream;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
/*
Stream provides following features:

Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
Stream is functional in nature. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
Stream is lazy and evaluates code only when required.
The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
*
* */
public class StreamAddExample {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,9,1};
        // printing even num multiplied by 2
        Arrays.stream(nums)
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .forEach(System.out::println);

        System.out.println("********");

        // reducing

        List<Integer> arrayList = Arrays.asList(2,3,4,7,9,1);
        Stream<Integer> data = arrayList.stream();
        int sum = data.filter(n -> n%2==1)
                .reduce(0, (c,e) -> c+e);
        System.out.println(sum);
        System.out.println("********");

        // sort
        Arrays.asList(2,3,4,7,9,1).stream()
                .sorted().forEach(n -> System.out.println(n));

        System.out.println("********");
        //
        List<Integer> list = Arrays.asList(2,3,4,7,5,9,1);
        list.stream()
                .filter(a -> a%2==1)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));
    }
}
