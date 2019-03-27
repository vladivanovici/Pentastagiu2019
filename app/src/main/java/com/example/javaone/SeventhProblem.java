package com.example.javaone;

public class SeventhProblem
{
    public static void main (String[] args)
    {
        int thisArray[] = {1, 1, 3, 2, 2, 1};
        int clumpsCount = 0;
        int previousElement = thisArray[0] + 1;
        boolean isOnClump = false;

        for(int i:thisArray)
        {
            if(i == previousElement)
            {
                if(isOnClump == false)
                {
                    System.out.println(i + " " + previousElement);
                    clumpsCount++;
                    isOnClump = true;
                }
            }
            else
                isOnClump = false;
            previousElement = i;
        }
        System.out.println("Number of clumps that have been found: " + clumpsCount);
    }
}
