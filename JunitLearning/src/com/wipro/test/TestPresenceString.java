package com.wipro.test;
import com.wipro.task.DailyTasks;
import org.junit.*;
import static org.junit.Assert.*;
public class TestPresenceString {
    @Test
    public void testpresent(){
        DailyTasks d1 = new DailyTasks();
        assertTrue(d1.checkPresence("aditya sharma","sharma"));
    }
}
