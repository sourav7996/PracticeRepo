package flowOfProgram_01;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class Problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int num = 0;
        System.out.println("Enter numbers you want to add or enter 'x' if you want to get sum of those numbers: ");
        while (true) {
            s = sc.nextLine();
            try{
                if (s.equals("x")) {
                    System.out.println("The sum is " + num);
                    break;
                } else {
                    int input = Integer.parseInt(s);
                    num += input;
                }
            }catch (Exception e){
                System.out.println("Please enter a valid number or enter 'x' to get the sum.");
            }

        }
    }
}
