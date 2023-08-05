package firstJava_02;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+"! welcome to code with Sourav!");
    }
}
