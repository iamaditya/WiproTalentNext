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


}
