package com.In20Minutes.learning.maven.maveninfewsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MavenInFewStepsApplication {

	public static void main(String[] args) {
		//This is the traditional way of object declaration
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		// int result = binarySearch.binarySearch(new int[]{12,4,6},13);
		// System.out.println((result));

		//ApplicationContext -> These manages maintains all the beans
		//call an ApplicationContext method(run) to access the beans using ApplicationContext class
		ApplicationContext applicationContext = SpringApplication.run(MavenInFewStepsApplication.class, args);
		//From the ApplicationContext, get the BInarySearchImpl bean and assign it to a BInarySearchImpl reference
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		//Use the bean to call the binarySearch methods
		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);

	}

}
