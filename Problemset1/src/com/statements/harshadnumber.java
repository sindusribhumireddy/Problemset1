package com.statements;


public class harshadnumber {

    public static void main(String[] args) {
        int number = 23;

        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }

    
    public static boolean isHarshadNumber(int num) {
      
        int sumOfDigits = sumOfDigits(num);
        
       
        return (num % sumOfDigits == 0);
    }
    
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;       
        }
        return sum;
    }
}

