package problem;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;     // 0, 1, negatives are not prime
        if (n == 2) return true;      // 2 is prime
        if (n % 2 == 0) return false; // even numbers > 2 are not prime

        for (int i = 3; i * i <= n; i += 2) { // check only odd divisors
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeSelf(int n) {
        if (n <= 1) return false;     // 0, 1, negatives are not prime
        if (n == 2) return true;      // 2 is prime
        int sqrt = (int) Math.sqrt(n);
        for (int i = sqrt; i >1; i--) { // check only odd divisors
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 31;
        if (isPrimeSelf(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
