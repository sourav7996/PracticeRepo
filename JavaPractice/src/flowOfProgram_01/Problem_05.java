package flowOfProgram_01;

import java.util.Scanner;

import static flowOfProgram_01.Problem_04.betterApproach;

//Take 2 numbers as inputs and find their LCM.
public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = 0;
        int gcd = 0;
        System.out.println("The given number's LCM is "+ lcmMethod1(num1,num2,lcm));
        System.out.println("The given number's LCM is "+ lcmMethod2(num1,num2,gcd));


    }
    public static int lcmMethod1(int num1, int num2, int lcm){
        int max = (num2>num1)? num2:num1;
        while(max!=0){
            if(max%num1==0 && max%num2==0){
                lcm = max;
                break;
            }
            max++;
        }
        return lcm;
    }

    public static int lcmMethod2(int num1, int num2, int gcd){
        gcd = (int) betterApproach(num1,num2,gcd);
        return (num1 * num2) / gcd;
    }
}
