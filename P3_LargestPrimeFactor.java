// Problem Link:    https://www.hackerrank.com/contests/projecteuler/challenges/euler003/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = sc.nextLong();
            System.out.println(ans(n));
        }
    }

    static long ans(long n) {
        long largePrime = -1; //store the largest prime factor

        while (n%2 == 0) {
            largePrime = 2;
            n /= 2;
        }

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largePrime = i;
                n /= i;
            }
        }

        if (n>2){
            largePrime = n;
        }

        return largePrime;
    }
}
