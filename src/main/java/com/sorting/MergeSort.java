package com.sorting;

import java.util.ArrayList;

public class MergeSort extends SortingAlgorithm
{
    @Override
    public <T extends Comparable<T>> T[] sortAscending(T[] values) 
    {
        if (values.length<=1)
            return values;
        
        return mergeSortAscending(values, 0, values.length-1);
    }

    @Override
    public <T extends Comparable<T>> T[] sortDescending(T[] values) 
    {
        if (values.length<=1)
            return values;
        
        return mergeSortDescending(values, 0, values.length-1);
    }
    
    private <T extends Comparable<T>> T[] mergeSortAscending(T[] values, int low, int high)
    {
        if (low==high)
            return values;
        
        int middle = (low + high) / 2;
        
        mergeSortAscending(values,low,middle);
        mergeSortAscending(values,middle+1,high);
        
        return mergeAscending(values,low,middle,high);
    }

    private <T extends Comparable<T>> T[] mergeSortDescending(T[] values, int low, int high)
    {
        if (low==high)
            return values;
        
        int middle = (low + high) / 2;
        
        mergeSortDescending(values,low,middle);
        mergeSortDescending(values,middle+1,high);
        
        return mergeDescending(values,low,middle,high);
    }
    
    private <T extends Comparable<T>> T[] mergeAscending(T[] values, int low, int middle, int high)
    {   
        int n = high - low + 1;        
        ArrayList<T> temp = new ArrayList<>(n);
        int i = low;
        int j = middle+1;
        int index = 0;
        
        while (i<=middle&&j<=high)
        {
            if (values[i].compareTo(values[j])<0)
            {
                temp.add(index, values[i]);
                i++;
            }
            else
            {
                temp.add(index, values[j]);
                j++;
            }
            index++;
        }
        
        while (i<=middle)
        {
            temp.add(index, values[i]);
            i++;
            index++;
        }
        
        while (j<=high)
        {
            temp.add(index, values[j]);
            j++;
            index++;
        }
        
        for (i = 0; i < n; i++)
        {
            values[low+i] = temp.get(i);
        }
        
        return values;
    }

    private <T extends Comparable<T>> T[] mergeDescending(T[] values, int low, int middle, int high)
    {   
        int n = high - low + 1;        
        ArrayList<T> temp = new ArrayList<>(n);
        int i = low;
        int j = middle+1;
        int index = 0;
        
        while (i<=middle&&j<=high)
        {
            if (values[i].compareTo(values[j])>0)
            {
                temp.add(index, values[i]);
                i++;
            }
            else
            {
                temp.add(index, values[j]);
                j++;
            }
            index++;
        }
        
        while (i<=middle)
        {
            temp.add(index, values[i]);
            i++;
            index++;
        }
        
        while (j<=high)
        {
            temp.add(index, values[j]);
            j++;
            index++;
        }
        
        for (i = 0; i < n; i++)
        {
            values[low+i] = temp.get(i);
        }
        
        return values;
    }    
}