package com.sorting;

public class Sorting 
{
    public static int[] bubbleSort(int[] a)
    {
        boolean swapped = true;
        
        if (a.length<=1)
            return a;
        
        while (swapped==true)
        {
            swapped = false;
            for (int i=1; i<a.length; i++)
            {
                if (a[i]<a[i-1])
                {
                    int swap = a[i];
                    a[i] = a[i-1];
                    a[i-1] = swap;
                    swapped = true;
                }
            }
        }
        return a;
    }
    
    public static int[] optimizedBubbleSort(int[] a)
    {
        boolean swapped = true;
        int length = a.length;
        
        if (a.length<=1)
            return a;
        
        while (swapped==true)
        {
            swapped = false;
            for (int i=1; i<length; i++)
            {
                if (a[i]<a[i-1])
                {
                    int swap = a[i];
                    a[i] = a[i-1];
                    a[i-1] = swap;
                    swapped = true;
                }
            }
            length--;
        }
        return a;
    }
    
    public static int[] insertionSort(int[] a)
    {
        if (a.length<=1)
            return a;
        
        for (int i = 1; i < a.length; i++)
        {
            int j = i;
            while (j > 0 && a[j-1] > a[j])
            {
                int swap = a[j];
                a[j] = a[j-1];
                a[j-1] = swap;
                j--;
            }
        }
        return a;
    }
}