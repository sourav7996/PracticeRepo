package firstJava_02;

import java.util.Scanner;

//5.Take 2 numbers as input and print the largest number.
public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for comparison: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println(num1+" is largest");
        } else {
            System.out.println(num2+ " is largest");
        }
    }
}
