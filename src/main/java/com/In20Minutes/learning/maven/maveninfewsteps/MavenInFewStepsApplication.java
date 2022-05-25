package com.In20Minutes.learning.maven.maveninfewsteps;

import com.In20Minutes.learning.maven.maveninfewsteps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class MavenInFewStepsApplication {

		private static Logger LOGGER = LoggerFactory.getLogger(MavenInFewStepsApplication.class);

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

		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("First Bean: "+binarySearch);
		System.out.println("Second Bean: "+binarySearch1);
		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);

	}

}
