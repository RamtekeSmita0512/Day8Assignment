package com.Bridgelabz.Day8Assignment;

public class EmployeeWageDays
{
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int emp_wage_per_hr = 20;
    public static final int number_of_working_days = 2;

    public static void main(String[] args)
    {
        int empHrs = 0, empWage = 0, totalEmpWage = 0;
        for (int day = 0; day < number_of_working_days; day++)
        {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case is_part_time:
                    empHrs = 4;
                    break;
                case is_full_time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }
            empWage = empHrs * emp_wage_per_hr;
            System.out.println("Emp Wage:" + empWage);
            totalEmpWage += empWage;
        }
        System.out.println("Total Emp Wage:" + totalEmpWage);
    }
}
