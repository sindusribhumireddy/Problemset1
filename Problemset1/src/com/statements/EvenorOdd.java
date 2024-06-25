package com.statements;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n + " is Even");
			
		}
		else {
			System.out.println(n + " is Odd");
			
		}

	}

}
