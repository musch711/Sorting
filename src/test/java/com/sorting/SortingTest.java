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
    private static Integer[] sortedIntegers;
    private static String[] unsortedStrings;
    private static String[] sortedStrings;
    
    
    public SortingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        sortedIntegers = new Integer[] {2,4,5,7,8,9,20,23,54,89};
        sortedStrings = new String[] {"Alpha","Beta","Delta","Gamma",};
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
        
        bubbleSort.sort(unsortedIntegers);
        assertArrayEquals(sortedIntegers, unsortedIntegers);
        
        bubbleSort.sort(unsortedStrings);
        assertArrayEquals(sortedStrings, unsortedStrings);
    }
    
    @Test
    public void testOptimizedBubbleSort() {
        SortingAlgorithm optimizedBubbleSort = new BubbleSort();
        
        optimizedBubbleSort.sort(unsortedIntegers);
        assertArrayEquals(sortedIntegers, unsortedIntegers);
        
        optimizedBubbleSort.sort(unsortedStrings);
        assertArrayEquals(sortedStrings, unsortedStrings);
    }    
    
            
/*
    @Test
    public void testQuickSort() {
        Sorting.quickSort(unsorted,0,unsorted.length-1);
        assertArrayEquals(sorted, unsorted);
    }
*/    
}
