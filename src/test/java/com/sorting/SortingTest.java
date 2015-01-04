package com.sorting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author steven.muschler
 */
public class SortingTest {
    
    private static Integer[] unsortedIntegers;
    private static Integer[] sortedAscendingIntegers;
    private static Integer[] sortedDescendingIntegers;
    private static String[] unsortedStrings;
    private static String[] sortedAscendingStrings;
    private static String[] sortedDescendingStrings;
    
    
    public SortingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        sortedAscendingIntegers = new Integer[] {2,4,5,7,8,9,20,23,54,89};
        sortedDescendingIntegers = new Integer[] {89,54,23,20,9,8,7,5,4,2};
        sortedAscendingStrings = new String[] {"Alpha","Beta","Delta","Gamma",};
        sortedDescendingStrings = new String[] {"Gamma","Delta","Beta","Alpha"};
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        unsortedIntegers = new Integer[] {4,5,2,7,8,9,23,54,89,20};
        unsortedStrings = new String[] {"Beta","Alpha","Delta","Gamma"};
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testBubbleSort() {
        SortingAlgorithm bubbleSort = new BubbleSort();
        
        bubbleSort.sortAscending(unsortedIntegers);
        assertArrayEquals(sortedAscendingIntegers, unsortedIntegers);
        
        bubbleSort.sortAscending(unsortedStrings);
        assertArrayEquals(sortedAscendingStrings, unsortedStrings);
        
        bubbleSort.sortDescending(unsortedIntegers);
        assertArrayEquals(sortedDescendingIntegers, unsortedIntegers);
        
        bubbleSort.sortDescending(unsortedStrings);
        assertArrayEquals(sortedDescendingStrings, unsortedStrings);
    }
    
    @Test
    public void testOptimizedBubbleSort() {
        SortingAlgorithm optimizedBubbleSort = new BubbleSort();
        
        optimizedBubbleSort.sortAscending(unsortedIntegers);
        assertArrayEquals(sortedAscendingIntegers, unsortedIntegers);
        
        optimizedBubbleSort.sortAscending(unsortedStrings);
        assertArrayEquals(sortedAscendingStrings, unsortedStrings);
        
        optimizedBubbleSort.sortDescending(unsortedIntegers);
        assertArrayEquals(sortedDescendingIntegers, unsortedIntegers);
        
        optimizedBubbleSort.sortDescending(unsortedStrings);
        assertArrayEquals(sortedDescendingStrings, unsortedStrings);        
    }
    
    @Test
    public void testInsertionSort() {
        SortingAlgorithm insertionSort = new InsertionSort();
        
        insertionSort.sortAscending(unsortedIntegers);
        assertArrayEquals(sortedAscendingIntegers, unsortedIntegers);
        
        insertionSort.sortAscending(unsortedStrings);
        assertArrayEquals(sortedAscendingStrings, unsortedStrings);
        
        insertionSort.sortDescending(unsortedIntegers);
        assertArrayEquals(sortedDescendingIntegers, unsortedIntegers);
        
        insertionSort.sortDescending(unsortedStrings);
        assertArrayEquals(sortedDescendingStrings, unsortedStrings);         
    }    
    
    @Test
    public void testQuickSort() {
        SortingAlgorithm quickSort = new QuickSort();
        
        quickSort.sortAscending(unsortedIntegers);
        assertArrayEquals(sortedAscendingIntegers, unsortedIntegers);
        
        quickSort.sortAscending(unsortedStrings);
        assertArrayEquals(sortedAscendingStrings, unsortedStrings);
        
        quickSort.sortDescending(unsortedIntegers);
        assertArrayEquals(sortedDescendingIntegers, unsortedIntegers);
        
        quickSort.sortDescending(unsortedStrings);
        assertArrayEquals(sortedDescendingStrings, unsortedStrings);         
    } 
}
