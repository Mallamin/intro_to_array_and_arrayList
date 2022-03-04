package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks= {100,10,25,67
	};
	Student student = new Student("Lamin", marks);

	int number = student.getNumberOfMarks();
	System.out.println("Number of Marks :" + number);
	int sum = student.getTotalSumOfMarks();
	System.out.println("Sum of Marks :" + sum);
	int maximumMark = student.getMaximumMark();
	System.out.println("Maximum  Mark :" + maximumMark);
	int minimumMark = student.getMinimumMark();
	System.out.println("Minimum Mark :" + minimumMark);

	BigDecimal average = student.getAverageMarks();
	System.out.println("Average  :" + average);

}
}
