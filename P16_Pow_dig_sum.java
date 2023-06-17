// Problem Link: https://www.hackerrank.com/contests/projecteuler/challenges/euler016/problem?isFullScreen=true

// Solution 1: (Doesn't pass all the test cases because of large value of 2^N)

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(ans(pwr(n)));
        }
    }

    static int ans(int n) {
        int sum = 0;
        int m = n;
        while (m > 0) {
            int dig = m % 10;
            sum += dig;
            m = m / 10;
        }
        return sum;
    }

    static int pwr(int n) {
        return (int) 1<<n;
    }
}





// Solution 2: (Accepted)

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(ans(pwr(n)));
        } 
    }
    static int ans(BigInteger n){
        int sum=0;
        String str=n.toString(); 
        for(int i=0;i<str.length();i++){
            sum+=Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
    static  BigInteger pwr(int n){
        BigInteger base = new BigInteger("2");
        return base.pow(n);
    }
}


