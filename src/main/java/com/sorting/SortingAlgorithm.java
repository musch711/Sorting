package com.sorting;

public abstract class SortingAlgorithm
{
    protected <T> void swap(T[] values, int a, int b) 
    {
        T temp = values[a];
        values[a] = values[b];
        values[b] = temp;
    }
    
    public abstract <T extends Comparable<T>> T[] sort(T[] values);
}
