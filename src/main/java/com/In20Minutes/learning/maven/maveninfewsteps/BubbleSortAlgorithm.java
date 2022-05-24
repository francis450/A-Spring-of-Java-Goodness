package com.In20Minutes.learning.maven.maveninfewsteps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // Tells Spring to manage beans from this class
//@Primary // Incase there are a number of Sort algorithms, the BubbleSortAlgorithm will be utilized first
@Qualifier("bubble") //If during injection, we use the @Qualifier("bubble") this component is injected first
public class BubbleSortAlgorithm implements SortingAlgorithm {
    public int[] sort(int [] numbers){
        //logic for BUbbleSortAlgorithm goes here
        return numbers;
    }
}
