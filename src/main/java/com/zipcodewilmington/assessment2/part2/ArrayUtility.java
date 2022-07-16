package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;

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
       Integer[] merg = merge(array, array);
       Integer[] rotat = new Integer[array.length];
       for (int i = 0; i < array.length; i++) {
           rotat[i] = merg[index + i];
       }
        return rotat;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
       Integer[] count = merge(array1, array2);
       int counter = 0;
       for (int i = 0; i < count.length; i++) {
           if (count[i] == valueToEvaluate) {
               counter++;
           }

       }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
      int count = 0;
      int value = 0;
      for (int i = 0; i < array.length; i++) {
         if (countOccurrence(array, array, array[i]) > count) {
             count = countOccurrence(array, array, array[i]);
             value = array[i];
         }
      }
        return value;
    }
}
