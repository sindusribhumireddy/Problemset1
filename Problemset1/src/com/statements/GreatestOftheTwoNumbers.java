package com.statements;
import java.util.Scanner;

public class GreatestOftheTwoNumbers {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the a value");
			int a=sc.nextInt();
			System.out.println("enter the b value");
			int b=sc.nextInt();
			if(a>b) {
				System.out.println("a is greater than b");
			}
			else {
				System.out.println("b is greater than a");
			}

		}

	}
