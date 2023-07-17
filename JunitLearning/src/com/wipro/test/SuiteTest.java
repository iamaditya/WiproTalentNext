package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestPresenceString.class,
        TestSortedArray.class,
        testStringConcat.class
})
public class SuiteTest {
}
