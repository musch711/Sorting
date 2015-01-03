package com.sorting;

public class OptimizedBubbleSort extends SortingAlgorithm
{
    @Override
    public <T extends Comparable<T>> T[] sortAscending(T[] values) 
    {
        int length = values.length;
        boolean swapped = true;
        
        if (values.length<=1)
            return values;
        
        while (swapped==true)
        {
            swapped = false;
            for (int i=1; i<length; i++)
            {
                if (values[i].compareTo(values[i-1])<0)
                {
                    swap(values, i, i-1);
                    swapped = true;
                }
            }
            length--;
        }
        return values;        
    }
    
    @Override
    public <T extends Comparable<T>> T[] sortDescending(T[] values) 
    {
        int length = values.length;
        boolean swapped = true;
        
        if (values.length<=1)
            return values;
        
        while (swapped==true)
        {
            swapped = false;
            for (int i=1; i<length; i++)
            {
                if (values[i].compareTo(values[i-1])>0)
                {
                    swap(values, i, i-1);
                    swapped = true;
                }
            }
            length--;
        }
        return values;  
    }
}