package com.bridgelabz.Day03;

public class EmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int empPresent = 1;
        int empPartTime = 2;
        int empCheck = (int) (Math.random() * 10) % 3;
        if (empCheck == empPresent) {
            System.out.println("Employee is doing Full time work");
            int totalWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
            System.out.println("Daily wage of Employee is : " + totalWage);
        } else if (empCheck == empPartTime) {
            System.out.println("Employee is doing Part time work");
            int totalWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Daily wage of Employee is : " + totalWage);
        } else
            System.out.println("Employee is Absent");
    }
}
