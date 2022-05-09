package com.Bridgelabz.Day8Assignment;

public class EmployeePartTime
{

        public static void main(String[] args)
        {
            int full_time = 1;
            int part_time = 2;
            int emp_wage_per_hour = 20;
            int empHrs = 0;
            int empWage = 0;
            double empCheck = Math.floor(Math.random() * 10) % 2;
            if (empCheck == full_time)
            {
                empHrs = 8;
                System.out.println("full time");
            } else if (empCheck == part_time)
            {
                empHrs = 4;
                System.out.println("part time");
            } else
            {
                empHrs = 0;
                System.out.println("absent");
            }
            empWage = empHrs * emp_wage_per_hour;
            System.out.println("Emp Wage:" + empWage);

        }
 }
