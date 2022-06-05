package com.epam.stringutils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Tests {
    @Test
    void isPositiveTest(){
        String first = "123";
        String second = "-123";
        String third = "asd";
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPositiveNumber(first));
        assertFalse(stringUtils.isPositiveNumber(second));
        assertFalse(stringUtils.isPositiveNumber(third));
    }

}
