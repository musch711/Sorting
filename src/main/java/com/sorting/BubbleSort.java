package com.sorting;

public class BubbleSort extends SortingAlgorithm
{
    @Override
    public <T extends Comparable<T>> T[] sort(T[] values) 
    {   
        if (values.length<=1)
            return values;
        
        for (int i = 1; i < values.length; i++)
            for (int j = 1; j < values.length; j++)
                if (values[j].compareTo(values[j-1])<0)
                    swap(values,j,j-1);
        
        return values;        
    }
}