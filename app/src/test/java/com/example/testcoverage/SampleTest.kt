package com.example.testcoverage

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class SampleTest {
    private lateinit var sample: Sample

    @Before
    fun setUp() {
        sample = Sample()
    }

    @Test
    fun testAdd() {
        assertEquals(4, sample.add(2, 2))
        assertEquals(-4, sample.add(-2, -2))
    }

    @Test
    fun testSubtract() {
        assertEquals(1, sample.subtract(3, 2))
    }

    @Test
    fun testMultiply() {
        assertEquals(6, sample.multiply(3, 2))
    }

    @Test
    fun testDivide() {
        assertEquals(2, sample.divide(4, 2))
    }
}