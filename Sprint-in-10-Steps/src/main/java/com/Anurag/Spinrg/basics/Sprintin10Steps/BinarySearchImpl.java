package com.Anurag.Spinrg.basics.Sprintin10Steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {


    //AutoWring through Setter methods
    @Autowired
    private SortAlgorithm sortAlgorithm;

    /* Auto Wiring through constructor
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    */


    /*
    Setter Injection
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
     */

    public int BinarySearch(int[] numbers, int numberToSearchFor){
        // Sort the Array
            // Say we want to use the Bubble and Quick sort interchangeably as per our wish
            // and also we don't want to use the tight coupling feature
            // Because in future we if want to change the bubble sort or Quick sort logic then Binary search logic/class is
            // not affected.
            // To use that we use concept of loose coupling with help of interface
            // In core Java , we can implement loose Coupling concept using interface.
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // Search Logic

        //Return the answer
        return 3;
    }
}
