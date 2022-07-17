package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class ListUtility {
ArrayList<Integer> list = new ArrayList<Integer>();
List<String> str = new ArrayList<String>();
    public Boolean add(int i) {
       return list.add(i);

    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        HashSet<Integer> uniq = new HashSet<Integer>(list);
        return new ArrayList<>(uniq);
    }

    public String join() {
      String solution = " ";

      for (int i = 0; i < list.size(); i++) {
          if (i == list.size() -1)
              solution += list.get(i);
          else {
              solution += list.get(i) + ", ";
          }
      }
      return solution;
    }

//    public Integer mostCommon() {
//     Integer solution = 0;
//     int counter = 0;
//
//     for (int i = 0; i < list.size() -1; i++) {
//
//     }
//      return null;
//
//    }



    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
