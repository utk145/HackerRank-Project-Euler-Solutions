// Problem Link:  https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem?isFullScreen=true


// Solution 1: Brute Force

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P1_Mul_3and5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = sc.nextInt();
            System.out.println(ans(n));
        }
    }
    static int ans(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(i%3==0 || i%5==0)
                sum+=i;
        }
        return sum;
    }
}




//  Solution 2 : 

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
            int n = sc.nextInt();
            System.out.println(ans(n));
        }
    }
   static long ans(int n) {
        long sum = 0;
        long threeSum = sumOfMultiples(n, 3);
        long fiveSum = sumOfMultiples(n, 5);
        long fifteenSum = sumOfMultiples(n, 15);
        sum = (threeSum+fiveSum ) - fifteenSum;
        return sum;
    }
    static long sumOfMultiples(int n, int divisor) {
        long p = (n - 1) / divisor; // p : Number of multiples of a divisor below n
        return  (divisor * p * (p + 1)) / 2; 
    }
}



/*  Approach for Sol-2:

    The ans method calculates the sum by subtracting the sum of multiples of 15 (common multiples of 3 and 5) from the sum of multiples of 3 and 5. It uses the sumOfMultiples method to calculate each individual sum.

 */
