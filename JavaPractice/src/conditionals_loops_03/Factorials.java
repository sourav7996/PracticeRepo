package conditionals_loops_03;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to determine Factorial of: ");
        int num = in.nextInt();
        int temp = num;
        int factorial = 1;
        while (temp!=0){
            factorial*=temp;
            temp-=1;
        }
        System.out.printf("The factorial is: %d!= %d",num,factorial);
    }
}
