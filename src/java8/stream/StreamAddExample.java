package java8.stream;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

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
        List<Integer> list = Arrays.asList(2,3,4,7,9,1);
        list.stream()
                .filter(a -> a%2==1)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));
    }
}
