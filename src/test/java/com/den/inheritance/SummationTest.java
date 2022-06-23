package com.den.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SummationTest {

    @BeforeEach
    void setUp() {

    }

    //@Test
//    public  void shouldReturnSum(){
//    Summation summation = new  Summation();
//        int addActual = summation.add(3, 2);
//        int expect = 5;
//        assertEquals( expect,addActual);
//    }
    @ParameterizedTest
    @ValueSource(strings = {"racer", "radar", "madam","able was I ere I saw elba","deny"})
    void shouldReturnPalindromeValidity(String str) {
        Summation summation = new Summation();
        boolean actual = summation.isPall(str);
        assertTrue(actual);


    }
}