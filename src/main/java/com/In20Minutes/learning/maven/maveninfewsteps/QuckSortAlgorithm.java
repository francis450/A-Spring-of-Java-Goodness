package com.In20Minutes.learning.maven.maveninfewsteps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("qucik")
public class QuckSortAlgorithm implements SortingAlgorithm{
    public int[] sort(int [] numbers){
        //Quicksort algorithm
        return numbers;
    }
}
