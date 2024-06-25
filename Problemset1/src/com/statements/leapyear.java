package com.statements;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		
		
	    boolean isLeapYear;

	    isLeapYear = (year % 4 == 0);

	    isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

			   if (isLeapYear) {
			      System.out.println(year + " is a leap year.");
			    } else {
			      System.out.println(year + " is not a leap year.");
			    }
	}
			

}


