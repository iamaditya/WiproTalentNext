package com.wipro.test;
import com.wipro.task.DailyTasks;
import org.junit.*;
public class TestSortedArray {
    @Test
    public void testsortVal(){
        int arr[] = {5,1,2,4,3};
        int sort[] = {1,2,3,4,5};

        DailyTasks d1 = new DailyTasks();

        Assert.assertArrayEquals(sort,d1.sortValues(arr));
    }
}
