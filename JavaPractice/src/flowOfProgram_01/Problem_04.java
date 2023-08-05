package flowOfProgram_01;

import java.util.Scanner;
//Take 2 numbers as inputs and find their HCF.
public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long gcd = 1;
        System.out.println("The gcd of "+ num1+ " and "+ num2+ " is:- "+ basicApproach(num1,num2,gcd)+" form basicApproach");
        System.out.println("The gcd of "+ num1+ " and "+ num2+ " is:- "+ betterApproach(num1,num2,gcd)+" form betterApproach");
        System.out.println("The gcd of "+ num1+ " and "+ num2+ " is:- "+ anotherApproach(num1,num2,gcd)+" form anotherApproach");
    }

    public static long basicApproach(long num1, long num2, long gcd) {
        long min;
        long max;
        if (num1>num2){
            min = num2;
            max = num1;
        }else {
            min = num1;
            max= num2;
        }
        for(long i =1;i<min;i++){
            if(min%i==0 && max%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static long betterApproach(long num1, long num2, long gcd){
        for(long i =1; i<=num1&& i<=num2; i++){
            if (num1%i==0 && num2%i==0){
                gcd =i;
            }
        }
        return gcd;
    }

    public static long anotherApproach(long num1, long num2, long gcd){
        while(num1!=num2)
        {
            if(num1>num2)
                num1=num1-num2;
            else
                num2=num2-num1;
        }
        gcd = num2;
        return gcd;
    }
}
