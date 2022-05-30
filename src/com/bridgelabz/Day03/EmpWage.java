package com.bridgelabz.Day03;

public class EmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    static final int NUM_OF_WORKINGDAYS = 20;

    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation for a month of 20days");
        int empHours = 0;
        int totalWorkingHrs =0;
        int totalWorkingDays=0;
        while (totalWorkingHrs <= MAX_WORKING_HOURS && totalWorkingDays < NUM_OF_WORKINGDAYS) {
            totalWorkingDays++;
            double empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case FULL_TIME_HOUR:
                    System.out.println("Employee is Present and working Full time");
                    empHours = 8;
                    break;
                case PART_TIME_HOUR:
                    System.out.println("Employee is Present and working Part time");
                    empHours = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");

            }
            totalWorkingHrs += empHours;
            System.out.println("Day#: " + totalWorkingDays + "EmployeeHours :" + empHours);
        }
            int totalWage = totalWorkingHrs*WAGE_PER_HOUR;
            System.out.println("Employee wage for the month : " + totalWage);
        }
    }
