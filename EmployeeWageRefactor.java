package com.Bridgelabz.Day8Assignment;

public class EmployeeWageRefactor
{
    // constants
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;
    public static final int emp_wage_per_hr = 20;
    public static final int number_of_working_days = 2;
    public static final int max_hrs_in_month = 10;

    public static void main(String[] args) {
        // variables
        int empHrs = 0, totalHrs = 0, totalWorkingDays = 0;
        // computation
        while (totalHrs <= max_hrs_in_month && totalWorkingDays <= number_of_working_days) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case is_part_time:
                    empHrs = 4;
                    break;
                case is_full_time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empHrs += totalHrs;
            System.out.println("Days:" + totalWorkingDays + "Emp Hrs:" + empHrs);
        }
        int totalEmpWage = empHrs * emp_wage_per_hr;
        System.out.println("total emp wage:" + totalEmpWage);

    }
}
