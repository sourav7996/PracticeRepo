package flowOfProgram_01;

import java.util.Scanner;

//count of a digit in a number
public class Problem_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();
        System.out.println("Please enter the digit that you want to count from ur number: ");
        int digit = sc.nextInt();
        int count=0;
        if(digit/10==0){
            while (number > 0){
                int rem = number%10;
                if (rem == digit){
                    count++;
                }
                number/=10;
            }
            System.out.println(count);
        } else {
            System.out.println("please enter valid digit.");
        }



    }
}
