package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> part4 = new HashSet<String>();
        for(String Set4: firstSet) {
            if (secondSet.contains(Set4) && !thirdSet.contains(Set4))
                part4.add(Set4);

        }
        for(String Set4: thirdSet){
            if(!firstSet.contains(Set4) && !secondSet.contains(Set4))
                part4.add(Set4);
            }
        return part4;
    }
}
