package com.tdd;

import java.util.Arrays;

/**
 * Created by Jiaxin Li on 5/20/19.
 */
public class PrimeUtil {


    public static int[] getPrime(int max) {
        if (max <= 2) {
            return new int[]{};
        }

        int[] primes = new int[max];

        int count = 0;
        for (int number = 2; number < max; number++) {
            if (isPrime(number)) {
                primes[count++] = number;
            }
        }
        primes = Arrays.copyOf(primes, count);

        return primes;


    }

    private static boolean isPrime(int number) {

        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
