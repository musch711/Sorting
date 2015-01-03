package com.sorting;

public class Sorting 
{    
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
    
    public static int[] mergeSort(int[] a)
    {
        if (a.length<=1)
            return a;
        
        int middle = (a.length - 1) / 2;
        int[] left = new int[middle];
        int[] right = new int[a.length-middle];
        
        for (int i = 0; i < middle; i++)
            left[i] = a[i];
        
        for (int i = 0; i < a.length; i++)
            right[i] = a[i];
        
        mergeSort(left);
        mergeSort(right);
        
        return merge(left,right);
    }
    
    private static int[] merge(int[] a, int[] b)
    {
        int[] result = new int[a.length+b.length];
        
        while(a.length>0&&b.length>0)
        {
            
        }
        
        while(a.length>0)
        {
            
        }
        
        while(b.length>0)
        {
            
        }
        
        return result;
    }
}