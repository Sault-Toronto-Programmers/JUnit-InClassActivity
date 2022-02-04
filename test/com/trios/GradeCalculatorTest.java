package com.trios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    @Test
    void testPassOrFail1() throws Exception{
       assertThrows(Exception.class,() -> {
            GradeCalculator.passOrFail(-1);
        } );
    }

    @Test
    void testPassOrFail2() throws Exception{
        boolean result = GradeCalculator.passOrFail(0);
        assertFalse(result);
    }

    @Test
    void testPassOrFail3() throws Exception{
        boolean result = GradeCalculator.passOrFail(1);
        assertFalse(result);
    }

    @Test
    void testPassOrFail4() throws Exception{
        boolean result = GradeCalculator.passOrFail(49);
        assertFalse(result);
    }

    @Test
    void testPassOrFail5() throws Exception{
        boolean result = GradeCalculator.passOrFail(50);
        assertTrue(result);
    }

    @Test
    void testPassOrFail6() throws Exception{
        boolean result = GradeCalculator.passOrFail(51);
        assertTrue(result);
    }

    @Test
    void testPassOrFail7() throws Exception{
        boolean result = GradeCalculator.passOrFail(99);
        assertTrue(result);
    }

    @Test
    void testPassOrFail8() throws Exception{
        boolean result = GradeCalculator.passOrFail(100);
        assertTrue(result);
    }

    @Test
    void testPassOrFail9() throws Exception{
        assertThrows(Exception.class,() -> {
            GradeCalculator.passOrFail(101);
        } );
    }

}