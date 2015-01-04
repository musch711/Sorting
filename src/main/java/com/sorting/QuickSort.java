package com.sorting;

public class QuickSort extends SortingAlgorithm
{
    @Override
    public <T extends Comparable<T>> T[] sortAscending(T[] values) 
    {   
        return quickSortAscending(values,0,values.length-1);        
    }

    @Override
    public <T extends Comparable<T>> T[] sortDescending(T[] values) 
    {
        return quickSortDescending(values,0,values.length-1);        
    }

    private <T extends Comparable<T>> T[] quickSortAscending(T[] values, int low, int high)
    {
        if (values.length<=1)
            return values;
        
        int pivot = partitionAscending(values, low, high);
        
        if (low<pivot-1)
            quickSortAscending(values, low, pivot-1);
        
        if (high>pivot)
            quickSortAscending(values, pivot, high);
            
        return values;
    }
    
    private <T extends Comparable<T>> int partitionAscending(T[] values, int left, int right)
    {
        int midIndex = (left + right - 1)/2;
        T pivot = values[getPivot(values, left, midIndex, right)];
        
        while (left < right)
        {
            while (values[left].compareTo(pivot) < 0)
                left++;
            
            while (values[right].compareTo(pivot) > 0)
                right--;
            
            if (left <= right)
            {
                swap(values, left, right);
           
                left++;
                right--;
            }
        }
        return left;
    }

    private <T extends Comparable<T>> T[] quickSortDescending(T[] values, int low, int high)
    {
        if (values.length<=1)
            return values;
        
        int pivot = partitionDescending(values, low, high);
        
        if (low<pivot-1)
            quickSortDescending(values, low, pivot-1);
        
        if (high>pivot)
            quickSortDescending(values, pivot, high);
            
        return values;
    }    
    
    private <T extends Comparable<T>> int partitionDescending(T[] values, int left, int right)
    {
        //int midIndex = (left + right - 1)/2;
        T pivot = values[left];

        while (left < right)
        {
            while (values[left].compareTo(pivot) > 0)
                left++;
            
            while (values[right].compareTo(pivot) < 0)
                right--;
            
            if (left <= right)
            {
                swap(values, left, right);
           
                left++;
                right--;
            }
        }
        return left;
    }
    
   /*
    * Pick the median of the lowest, highest and middle index values
    * Provides better performance in certain instances
    */
    private <T extends Comparable<T>> int getPivot(T[] values, int low, int middle, int high)
    {
        //return low;
        
        if (values[low].compareTo(values[middle]) <= 0 && values[high].compareTo(values[middle]) >= 0)
            return middle;
        else if (values[low].compareTo(values[high]) <= 0 && values[low].compareTo(values[middle]) >= 0)
            return low;
        else
            return high;   
                
    }
}