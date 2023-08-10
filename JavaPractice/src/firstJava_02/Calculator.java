package firstJava_02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please enter the operator: ");
            int ans = 0;
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-'|| op =='*'|| op =='/'|| op =='%') {
                System.out.print("Enter the two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("invalid operation!");
                    }
                }
                System.out.println(ans);
            } else if (op=='X'|| op == 'x') {
                break;
            }else {
                System.out.println("invalid operation!");
            }
        }
    }
}
