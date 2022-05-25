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

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		//This will create return a new JdbcConnection Bean despite using the same instance
		LOGGER.info("{}",personDAO.getJdbcConnection());

		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO.getJdbcConnection());
	}

}
