package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        int size = sourceList.size();
        HashSet<Integer> part3 = new HashSet<Integer>();
        for(Integer number : sourceList){
            if(number % 2 == 0){
                while(number % 2 == 0) {
                    part3.add(number);
                    number /= 2;
                    if (number == 1)
                        part3.add(number);
                   }
                }
            else {
                part3.add(number);
                part3.add(number *2);
            }
        }
        return part3;
    }
}
