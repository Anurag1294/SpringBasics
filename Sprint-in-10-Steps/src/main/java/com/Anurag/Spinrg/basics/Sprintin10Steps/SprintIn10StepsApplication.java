package com.Anurag.Spinrg.basics.Sprintin10Steps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprintIn10StepsApplication {
	//Concept of Loose Coupling


	//What the beans? - @Component are beans
	//what are dependencies of a bean?  - @AutoWired are dependencies
	// where to search for beans?  - As we are in same package so need to do it


	public static void main(String[] args) {

		/*
		BinarySearchImpl binarySearchUsingBubble = new BinarySearchImpl(new BubbleSort());
		// com.Anurag.Spinrg.basics.Sprintin10Steps.BubbleSort@7cd84586
		BinarySearchImpl binarySearchUsingQuick = new BinarySearchImpl(new QuickSort());
		// com.Anurag.Spinrg.basics.Sprintin10Steps.QuickSort@30dae81

		int result = binarySearchUsingBubble.BinarySearch(new int[]{12,4,6,}, 3);

		int result1 = binarySearchUsingQuick.BinarySearch(new int[]{12,4,6,}, 3);
		*/


		//bean is an instance of bubbleSort
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());

		//int result = binarySearch.BinarySearch(new int[]{12,4,6,}, 3);;

		//System.out.println(result);



		// All beans are managed by application context
		ApplicationContext  applicationContext =SpringApplication.run(SprintIn10StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.BinarySearch(new int[]{12,4,6,}, 3);
		System.out.println(result);
		//com.Anurag.Spinrg.basics.Sprintin10Steps.BubbleSort@74bdc168
		//3
	}
}
