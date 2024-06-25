package com.statements;

public class abundantnumber {

    public static void main(String[] args) {
        int number = 24;

        if (isAbundantNumber(number)) {
            System.out.println(number + " is an abundant number");
        } else {
            System.out.println(number + " is not an abundant number");
        }
    }

    
    public static boolean isAbundantNumber(int num) {
       
        int sumOfDivisors = sumOfProperDivisors(num);
        
        
        return (sumOfDivisors > num);
    }
    
    
    public static int sumOfProperDivisors(int num) {
        if (num <= 1) {
            return 0; 
        }
        
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    sum += i;
                } else {
                    sum += i + num / i; 
                }
            }
        }
        
       
        sum -= num;
        
        return sum;
    }
}

