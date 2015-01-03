package com.sorting;

public class InsertionSort extends SortingAlgorithm
{
    @Override
    public <T extends Comparable<T>> T[] sortAscending(T[] values) 
    {
        if (values.length<=1)
            return values;
        
        for (int i = 1; i < values.length; i++)
        {
            int j = i;
            while (j > 0 && values[j-1].compareTo(values[j]) > 0)
            {
                swap(values, j, j-1);
                j--;
            }
        }
        return values;
    }

    @Override
    public <T extends Comparable<T>> T[] sortDescending(T[] values) 
    {
        if (values.length<=1)
            return values;
        
        for (int i = 1; i < values.length; i++)
        {
            int j = i;
            while (j > 0 && values[j-1].compareTo(values[j]) < 0)
            {
                swap(values, j, j-1);
                j--;
            }
        }
        return values;
    }
}