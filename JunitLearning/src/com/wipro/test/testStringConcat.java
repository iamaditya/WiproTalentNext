package com.wipro.test;

import com.wipro.task.DailyTasks;
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;
public class testStringConcat {

    @Test
    public void teststring(){
        DailyTasks d1 = new DailyTasks();

        assertEquals("hello aditya",d1.doStringConcat("hello","aditya"));
    }

    @Test
    public void testsortVal(){
        int arr[] = {5,1,2,4,3};
        int sort[] = {1,2,3,4,5};

        DailyTasks d1 = new DailyTasks();

        int result[] = d1.sortValues(arr);
//        assertTrue(Arrays.equals(result,sort));
        Assert.assertArrayEquals(sort,d1.sortValues(arr));
    }

    @Test
    public void testpresent(){
        DailyTasks d1 = new DailyTasks();
        assertTrue(d1.checkPresence("aditya sharma","sharma"));


    }
}
