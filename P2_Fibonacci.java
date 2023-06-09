// Problem Link:  https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(ans(n));
        }
    }
    static long ans(long n){
        long sum = 0,f1 = 1,f2 = 2;
        while (f2 <= n) {
            if (f2 % 2 == 0) {
                sum += f2;
            }
            long nextFib = f1 + f2;
            f1 = f2;
            f2 = nextFib;
        }

        return sum;
    }
}