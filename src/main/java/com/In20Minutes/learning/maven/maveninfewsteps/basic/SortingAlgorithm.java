package com.In20Minutes.learning.maven.maveninfewsteps.basic;

import org.springframework.stereotype.Component;

@Component //This tells spring that it needs to manage these beans
interface SortingAlgorithm {
    int[] sort(int[] numbers);
}
