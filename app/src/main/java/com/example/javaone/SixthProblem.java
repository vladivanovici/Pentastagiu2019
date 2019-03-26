package com.example.javaone;

import android.widget.Switch;

public class SixthProblem
{
    public static void main(String[] args)
    {
        int n = 5, i, j;
        int leftSide = n, rightSide = n + 2;
        char symbol = '=';

        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= n * 2 + 1; j++)
            {
                if(j == leftSide)
                {
                    System.out.print("/");
                    symbol = '_';
                }
                else
                if(j == rightSide)
                {
                    System.out.print("\\");
                            symbol = '=';
                }
                else
                    System.out.print(symbol);
            }
            leftSide--;
            rightSide++;
            System.out.println();
        }
    }
}
