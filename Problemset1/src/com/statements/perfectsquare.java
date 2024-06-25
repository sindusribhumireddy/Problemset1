package com.statements;

import java.util.Scanner;

public class perfectsquare {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int number=sc.nextInt();

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square");
        } else {
            System.out.println(number + " is not a perfect square");
        }
    }

   
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false; 
        }
        
      
        int sqrt = (int) Math.sqrt(num);
        
      
        return (sqrt * sqrt == num);
    }
}

