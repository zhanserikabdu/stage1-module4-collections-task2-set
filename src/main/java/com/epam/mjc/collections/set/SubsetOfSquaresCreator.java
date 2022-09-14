package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> part4 = new TreeSet<Integer>();
        for(Integer number : sourceList){
            int d = 2;
            int c = (int)Math.pow(number,d);
            if(c >= lowerBound && c <= upperBound){
             part4.add(c);
            }
        }
        return part4;
    }

}
