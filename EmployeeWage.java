package com.Bridgelabz.Day8Assignment;

public class EmployeeWage
{
    public static void main(String[] args) {
        int full_time = 1;
        int emp_wage_per_hour = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == full_time) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * emp_wage_per_hour;
        System.out.println("Emp Wage:" + empWage);

    }
}
