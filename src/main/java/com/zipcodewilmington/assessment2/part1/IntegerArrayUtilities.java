package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
       if (array.length % 2 == 0) {
           return true;
       }
        return false;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = start; i <= stop; i++) {
            arr.add(i);

        }
        Integer[] result = arr.toArray(new Integer[arr.size()]);
        return result;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length -1] * array[array.length -2];
    }
}
