package com.bridgelabz.Day03;

public class EmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        double empCheck = Math.floor(Math.random() * 10) % 3;
        int employeeWage;
        switch ((int) empCheck) {
            case FULL_TIME_HOUR:
                System.out.println("Employee is Present and working Full time");
                employeeWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                System.out.println("Employee Daily Wage is : " + employeeWage);
                break;
            case PART_TIME_HOUR:
                System.out.println("Employee is Present and working Part time");
                employeeWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Employee Daily wage is : " + employeeWage);
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
}
