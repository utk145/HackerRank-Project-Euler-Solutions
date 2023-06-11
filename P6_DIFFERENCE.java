// Problem Link: https://www.hackerrank.com/contests/projecteuler/challenges/euler006/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(ans(n));
        }
    }

    public static long ans(long n) {
        long sos = (n * (n + 1) * (2 * n + 1)) / 6;
        long sum = (n * (n + 1)) / 2;
        long squareOfSum = sum * sum;
        long difference = squareOfSum - sos;
        return difference;
    }
}
