package com.bridgelabz.Day03;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int Present = (int) (Math.random() * 10) % 2;
        int empCheck = 1;
        if (empCheck == Present) {
            System.out.println("Employee is Present");
        } else
            System.out.println("Employee is absent");
    }
}
