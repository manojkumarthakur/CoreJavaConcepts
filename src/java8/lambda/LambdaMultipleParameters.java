package java8.lambda;

@FunctionalInterface
interface ThreeParametersFunctionalInterface {
    double calculateAverage(double a, double b, double c);
}

public class LambdaMultipleParameters {
    public static void main(String[] args) {
        // Using lambda expression to implement the calculateAverage method
        ThreeParametersFunctionalInterface t = (a,b,c) -> {
            // Code to be executed with the parameters
            return (a+b+c)/3;
        };
        // Invoking the method defined in the lambda expression
        System.out.println(t.calculateAverage(1,2,5));
    }
}
