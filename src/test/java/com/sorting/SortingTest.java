package com.sorting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sorting.Sorting;
import java.util.Arrays;
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
    
    private static int[] unsorted;
    private static int[] sorted;
    
    public SortingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        sorted = new int[] {2,4,5,7,8,9,20,23,54,89};
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        unsorted = new int[] {4,5,2,7,8,9,23,54,89,20};
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testBubbleSort() {
        unsorted = Sorting.bubbleSort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }
    
    @Test
    public void testOptimizedBubbleSort() {
        unsorted = Sorting.optimizedBubbleSort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }
    
    @Test
    public void testInsertionSort() {
        unsorted = Sorting.insertionSort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }    

    @Test
    public void testQuickSort() {
        unsorted = Sorting.quickSort(unsorted,0,unsorted.length-1);
        assertArrayEquals(sorted, unsorted);
    }    
}
