package com.sorting;

import java.util.Arrays;

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
    
    public static int[] quickSort(int[] a, int low, int high)
    {
        if (a.length<=1)
            return a;
        
        int pivot = partition(a, low, high);
        
        if (low<pivot-1)
            quickSort(a, low, pivot-1);
        
        if (high>pivot)
            quickSort(a, pivot, high);
            
        return a;
    }
    
    private static int partition(int[] a, int left, int right)
    {
        /*
        * Pick the median of the lowest, highest and middle index values
        * Provides better performance in certain instances
        */
        int pivot;
        int midIndex = (left + right - 1)/2;
        if (a[left] <= a[midIndex] && a[right] >= a[midIndex])
            pivot = a[midIndex];
        else if (a[left] <= a[right] && a[left] >= a[midIndex])
            pivot = a[left];
        else
            pivot = a[right];
        
        while (left < right)
        {
            while (a[left] < pivot)
                left++;
            
            while (a[right] > pivot)
                right--;
            
            if (left <= right)
            {
                int swap = a[left];
                a[left] = a[right];
                a[right] = swap;
                
                left++;
                right--;
            }
        }
        return left;
    }
}