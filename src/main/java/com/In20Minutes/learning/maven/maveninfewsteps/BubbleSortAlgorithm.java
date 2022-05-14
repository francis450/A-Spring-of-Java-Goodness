package com.In20Minutes.learning.maven.maveninfewsteps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Incase there are a number of Sort algorithms, the BubbleSortAlgorithm will be utilized first
public class BubbleSortAlgorithm implements SortingAlgorithm {
    public int[] sort(int [] numbers){
        //logic for BUbbleSortAlgorithm
        return numbers;
    }
}
