package firstJava_02;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Please enter an operator for what operation you want to perform: ");
        String ch = sc.next();
        System.out.println("Enter second number: ");
        float num2 = sc.nextFloat();
        switch (ch) {
            case "+" -> {
                float add = num1 + num2;
                System.out.println("The result is: " + add);
            }
            case "-" -> {
                float sub = num1 - num2;
                System.out.println("The result is: " + sub);
            }
            case "*" -> {
                float multi = num1 * num2;
                System.out.println("The result is: " + multi);
            }
            case "/" -> {
                float div = num1 / num2;
                System.out.println("The result is: " + div);
            }
            default -> System.out.println("please enter valid operator");
        }
    }
}
