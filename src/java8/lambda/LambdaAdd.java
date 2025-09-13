package java8.lambda;

import java.util.Arrays;
import java.util.List;

/*
* The Lambda expression is used to provide the implementation of an interface that has a functional interface.
*Java lambda expression is treated as a function, so the compiler does not create a .class file.

Why use Lambda Expression?
Lambda expressions in Java help to implement functional interfaces more concisely and expressively, thereby eliminating lengthy boilerplate code and strengthening readability.
*  Lambda expressions help to provide a more compact alternative to anonymous classes and thus to simplify the code and reduce verbosity.
*
* Aside from this, they foster the implementation of parallel programming constructs and, in general, give room for the elimination of bugs through coding practices that are neat and error-free.
*
*
*
Java Lambda Expression Syntax
(argument-list) -> {body}
Java lambda expression consists of the following three components:

Argument-list: It can be empty or non-empty as well.
Arrow-token: It is used to link the arguments list and body of expression.
Body: It contains expressions and statements for lambda expression.

 * */
public class LambdaAdd {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Example 1: Using forEach with a lambda expression
        System.out.println("Example 1: Using forEach");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();  // New line for better output formatting
        // Example 2: Using map and reduce to calculate the sum of squares
        System.out.println("Example 2: Using map and reduce");
        int sumOfSquares = numbers.stream()
                .map(x -> x * x)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sumOfSquares);
        // Example 3: Using filter to get even numbers
        System.out.println("Example 3: Using filter");
        List<Integer> evenNumbers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .toList();  // Convert stream to list (Java 16+)
        System.out.println("Even numbers: " + evenNumbers);

        System.out.println("******");
//        numbers.forEach( x-> System.out.println(x));
//        numbers.stream().filter(x -> x%2 ==0).forEach(System.out::println);
        numbers.stream().map( n-> n+n).filter(x -> x%2==0).forEach(System.out::println);
       int sum = numbers.stream().map( n-> n+n).filter(x -> x%2==0).reduce(0, (a,b) -> a+b);
        System.out.println("sum: " + sum);

    }
}
