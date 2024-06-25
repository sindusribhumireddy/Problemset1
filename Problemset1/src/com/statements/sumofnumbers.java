package com.statements;

import java.util.Scanner;

public class sumofnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		System.out.println("enter m value");
		int m=sc.nextInt();
		int sum=0;
		for(int i=n;i<=m;i++) {
			sum+=i;
		
		}
		System.out.println("the sum of given range"+sum);
		

	}

}
