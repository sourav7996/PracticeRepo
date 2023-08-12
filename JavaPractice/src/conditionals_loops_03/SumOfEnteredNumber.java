package conditionals_loops_03;

import java.util.Scanner;

public class SumOfEnteredNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int num;
        System.out.println("Please enter the numbers: ");
        do {
            num = in.nextInt();
            sum+=num;
        }while (num!=0);
        System.out.printf("The sum of entered number is: %d", sum);

    }
}
