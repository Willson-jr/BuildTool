package com.epam.stringutils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str){
        return NumberUtils.toInt(str) > 0;
    }

}

