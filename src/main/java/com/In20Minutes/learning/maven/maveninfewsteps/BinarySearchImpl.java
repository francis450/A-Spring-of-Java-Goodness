package com.In20Minutes.learning.maven.maveninfewsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")//It means that with this component, Spring will create a new Bean whenever its requested
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//A better way for saying prototype Scope
public class BinarySearchImpl {
    @Autowired
    //@Qualifier()
    private SortingAlgorithm bubbleSortAlgorithm;
    //private SortingAlgorithm bubbleSortAlgorithm;//Dependecy injection by name(Name of the imlementation of the interface)


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
        System.out.println(sortedNumbers);
        //Sorting an array
        //Search the Array
        //Return the result

        return 20;
    }
}
