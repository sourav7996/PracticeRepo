package flowOfProgram_01;

import java.util.Scanner;

//Take two numbers and print the sum of both.
public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the desired numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The sum of the two given number is: "+ (num1+num2));
    }
}
