package com.In20Minutes.learning.maven.maveninfewsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortingAlgorithm sortingAlgorithm;


    //This is called constructor injection - Injection of dependencies using the constructor
    public BinarySearchImpl(SortingAlgorithm sortingAlgorithm){
        super();
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int binarySearch(int [] numbers, int numberToSearchFor){

        int [] sortedNumbers = sortingAlgorithm.sort(numbers);
        System.out.println(sortingAlgorithm);
        //Sorting an array
        //Search the Array
        //Return the result

        return 20;
    }
}