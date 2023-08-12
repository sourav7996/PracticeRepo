package conditionals_loops_03;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Price of the Product: ");
        float price = in.nextFloat();
        System.out.println("Please enter the discount percentage: ");
        float discount = in.nextFloat();
        float finalPrice= (price-((price*discount)/100));
        System.out.printf("The final price of the product after discount is: %.2f",finalPrice);
    }
}
