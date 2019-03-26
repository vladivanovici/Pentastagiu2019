package com.example.javaone;

public class SecondProblem {

    public static void main (String[] args)
    {
        int a = 235230;
        int sumOfa = 0;

        do{
            sumOfa += a % 10;
            a /= 10;
        } while (a != 0);

        System.out.println (sumOfa);
    }
}
