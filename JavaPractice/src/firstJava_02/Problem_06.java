package firstJava_02;

import java.util.Scanner;

//6.Input currency in rupees and output in USD.
public class Problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Indian rupees: ");
        float rupee = sc.nextFloat();
        float usd =  (rupee/82.68f);
        System.out.format("Value in USD is $%.2f\n", usd);
    }
}
