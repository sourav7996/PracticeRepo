package flowOfProgram_01;

import java.util.Scanner;

//Problem Statement:-> Input a year and find whether it is a leap year or not.
/*
            1.The year must be evenly divisible by 4;
            2.If the year can also be evenly divided by 100, it is not a leap year;
            unless...
            3.The year is also evenly divisible by 400. Then it is a leap year.*/
public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = sc.nextInt();
        if((year%400==0) || (year%4==0) && (year%100!=0)){
            System.out.println("Year "+ year + " is a leap year");
        } else {
            System.out.println("Year "+ year + " is not a leap year");
        }
    }
}
