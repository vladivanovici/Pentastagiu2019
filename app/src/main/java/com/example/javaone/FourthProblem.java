package com.example.javaone;

public class FourthProblem
{
    public static void main (String[] args)
    {
        String a = "abcdcba", invertedA = "";
        int lengthOfA = a.length();

        for(int i = lengthOfA - 1; i >= 0; i--)
            invertedA = invertedA + a.charAt(i);

        if(a.equals(invertedA))
            System.out.println("Palindrome.");
        else
            System.out.println("Not a palindrome.");
    }
}
