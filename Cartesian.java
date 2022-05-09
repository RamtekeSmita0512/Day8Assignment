package com.Bridgelabz.Day8Assignment;
import java.util.Scanner;
public class Cartesian {


           public static void main(String[] args) {
            // TO DO Auto-generated method stub

            int x1, y1, x2, y2, x, y;
            double linelength;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the value of x1: ");
            x1 = sc.nextInt();
            System.out.println("Enter the value of x2: ");
            x2 = sc.nextInt();
            System.out.println("Enter the value of y1: ");
            y1 = sc.nextInt();
            System.out.println("Enter the value of y2: ");
            y2 = sc.nextInt();

            x = x2 - x1;
            y = y2 - y1;

            linelength = Math.sqrt(x * x + y * y);
            System.out.println("Lenght of Line= " + linelength);

        }

    }
