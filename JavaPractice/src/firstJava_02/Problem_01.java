package firstJava_02;
import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class Problem_01 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any number: ");
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("The number you have entered is an even number.");
		} else{
			System.out.println("The number you have entered is an odd number.");
		}
    }
}
