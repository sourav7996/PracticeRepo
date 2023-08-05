package firstJava_02;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//Interest amount = p(1+rt)
public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Principal amount ");
        float principal = sc.nextFloat();
        //rate of interest:
        System.out.println("Please enter rate of interest:");
        float rate = sc.nextFloat();
        // time(in years)
        System.out.println("Please enter time(in years)");
        float time = sc.nextFloat();
        float interestAmount = (principal*rate*time)/100;
        float finalAmount = interestAmount+ principal;
        System.out.println("Your interest amount is Rs. "+ interestAmount);
        System.out.println("Do you want to check your final amount along with interest and principal?");
        System.out.println("If yes type 'Y' if not type 'N'. ");
        try{
            String conf = sc.next();
            if (conf.equalsIgnoreCase("Y")){
                System.out.println("Your total amount with principal and interest is: "+finalAmount);
            } else if(conf.equalsIgnoreCase("N")){
                System.out.println("Have a great day!");
            }
        }catch (Exception e){
            System.out.println("Please Enter valid input.");
        }
    }
}
