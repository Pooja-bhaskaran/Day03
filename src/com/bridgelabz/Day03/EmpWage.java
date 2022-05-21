package com.bridgelabz.Day03;

public class EmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int empPresent = 1;
        int empCheck = (int) (Math.random()*10)%2;
        if (empCheck == empPresent) {
            System.out.println("Employee is Present");
            int totalWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
            System.out.println("Daily wage of Employee is : " + totalWage);
        } else
            System.out.println("Employee is absent");
        
    }
}
