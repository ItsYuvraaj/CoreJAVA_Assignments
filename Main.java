package com.package2;

public class Main {

    public static void main(String[] args) {
        int m = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n-1 || j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i==n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0 || i+j<=(n-1)/2 || i-j>=(n-1)/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
