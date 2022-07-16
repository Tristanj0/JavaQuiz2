package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] intArr = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            intArr[i] = array1[i];
        }
        for (int j = array1.length; j < intArr.length; j++) {
            intArr[j] = array2[j - array1.length];
        }

        return intArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
