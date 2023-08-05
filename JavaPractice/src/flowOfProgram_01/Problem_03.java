package flowOfProgram_01;

import java.util.Scanner;

//Take a number as input and print the multiplication table for it.
public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The table of the given number is: ");
        for(int i=1; i<=20;i++){
            System.out.println(num+ " x "+i + " = "+ num*i);
        }

    }
}
