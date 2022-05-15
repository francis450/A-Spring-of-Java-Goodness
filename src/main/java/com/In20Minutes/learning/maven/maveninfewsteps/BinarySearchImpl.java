package com.In20Minutes.learning.maven.maveninfewsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortingAlgorithm bubbleSortAlgorithm;//Dependecy injection by name(Name of the imlementation of the interface)


    //This is called constructor injection - Injection of dependencies using the constructor
    /*public BinarySearchImpl(SortingAlgorithm bubbleSortAlgorithm){
        super();
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }*/

    //Setter injection
    /*public void setSortingAlgorithm(SortingAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }*/

    //We have no need to use a constructor injection because its hectic to maintain
    //Setter injection is reliable in that we dont need to define them manually

    public int binarySearch(int [] numbers, int numberToSearchFor){

        int [] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);
        //Sorting an array
        //Search the Array
        //Return the result

        return 20;
    }
}
