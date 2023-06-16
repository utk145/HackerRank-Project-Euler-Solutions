//  Problem Link: https://www.hackerrank.com/contests/projecteuler/challenges/euler008/problem?isFullScreen=true


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String num = sc.next();
            System.out.println(Ans(num, k));
        }
    }

    static long Ans(String num, int k) {
        long ans = 0;
        for (int i = 0; i <= num.length() - k; i++) {
            long prod = 1;
            for (int j = i; j < i + k; j++) {
                prod *= Character.getNumericValue(num.charAt(j));
            }
            ans = Math.max(ans, prod);
        }
        return ans;
    }
}
