package org.example;

public class Main {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Das Ergebnis lautet: " + fibonacci(n));
    }
}