package com.In20Minutes.learning.maven.maveninfewsteps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuckSortAlgorithm implements SortingAlgorithm{
    public int[] sort(int [] numbers){
        //Quicksort algorithm
        return numbers;
    }
}
