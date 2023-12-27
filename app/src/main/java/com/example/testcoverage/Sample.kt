package com.example.testcoverage

class Sample {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        if (b == 0) throw IllegalArgumentException("Divisor cannot be 0")
        return a / b
    }

    fun remainder(a: Int, b: Int): Int {
        return a % b
    }
}