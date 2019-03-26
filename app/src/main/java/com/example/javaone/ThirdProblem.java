package com.example.javaone;

public class ThirdProblem {

    void sumOfLengths (String a, String b)
    {
        int sum;
        sum = a.length() + b.length();
        System.out.println("The sum of the lengths of each string is " + sum);
    }

    void compareAB (String a, String b)
    {
        int minLength;
        minLength = a.length();

        if (minLength > b.length())
            minLength = b.length();

        boolean aBeforeB;
        aBeforeB = false;

        for (int i = 0; i < minLength; ++i)
            if(a.charAt(i) < b.charAt(i))
            {
                aBeforeB = true;
                i = minLength;
            }

        if(aBeforeB)
            System.out.println("a is before b");
        else
            System.out.println("a is not before b");
    }

    void upperCaseFirstCharacter (String a, String b)
    {
        String aUpper;
        aUpper = a.substring(0,1).toUpperCase() + a.substring(1);

        String bUpper;
        bUpper = b.substring(0,1).toUpperCase() + b.substring(1);

        System.out.println(aUpper + " " + bUpper);
    }

    public static void main (String[] args)
    {
        ThirdProblem prob = new ThirdProblem();

        String a = "apples";
        String b = "cabbage";

        prob.sumOfLengths(a, b);
        prob.compareAB(a, b);
        prob.upperCaseFirstCharacter(a, b);

    }
}
