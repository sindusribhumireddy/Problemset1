package com.statements;

import java.util.Scanner;

public class GreatestofThree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("largest number is "+a);
				
			}
			else {
				System.out.println("largest number is "+c);
			}
		}
		if(b>c) {
			System.out.println("largest number is"+b);
		}
		else {
			System.out.println("largest number is"+c);
		}
		

	}

}

