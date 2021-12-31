package arrays;

import java.util.ArrayList;
import java.util.List;

/*
    Given an integer A, you have to tell whether it is a prime number or not.
    A prime number is a natural number greater than 1 which is divisible only by 1 and itself.
    Ex: 3 , Result = true

 */
public class Factors {
    public static void main(String[] args) {
        isPrime(100);
        isPrime(25);
        isPrime(2);
    }

    public static void isPrime(int n) {
        int factors = factors(n);
        if (factors == 2) System.out.println(n + " is prime");
        else System.out.println(n + " is not prime");
    }

    public static int factors(int n) {
        int counter = 0;
        List<Integer> listOfFactors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    counter += 1;
                    listOfFactors.add(i);
                } else {
                    counter += 2;
                    listOfFactors.add(i);
                    listOfFactors.add(n / i);
                }
            }
        }
        System.out.println("Factors of " + n + " is = " + listOfFactors);
        return counter;
    }
}
