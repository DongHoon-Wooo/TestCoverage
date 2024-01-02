package com.example.testcoverage;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class JavaSampleTest {

    private JavaSample javaSample;

    @Before
    public void setUp() {
        javaSample = new JavaSample();
    }

    @Test
    public void testAdd() {
        TestCase.assertEquals(5, javaSample.add(2, 3));
    }
}