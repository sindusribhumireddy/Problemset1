package com.statements;

public class friendlypair {

    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;

        if (areFriendlyPair(number1, number2)) {
            System.out.println(number1 + " and " + number2 + " are friendly pairs");
        } else {
            System.out.println(number1 + " and " + number2 + " are not friendly pairs");
        }
    }

    public static boolean areFriendlyPair(int num1, int num2) {
        
        int sumOfDivisors1 = sumOfDivisors(num1);
        int sumOfDivisors2 = sumOfDivisors(num2);

       
        return (sumOfDivisors1 / num1 == num2 && sumOfDivisors2 / num2 == num1);
    }

    
    public static int sumOfDivisors(int num) {
        if (num <= 1) {
            return 0; 
        }

        int sum = 1; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    sum += i; 
                } else {
                    sum += i + num / i; 
                }
            }
        }

        return sum;
    }
}

