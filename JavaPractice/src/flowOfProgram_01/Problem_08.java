package flowOfProgram_01;
import java.util.Scanner;

//reversed number
public class Problem_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = in.nextInt();
        int ans = 0;
        while (number>0){
            int rem = number%10;
            number/=10;
            ans = ans*10+rem;
        }
        System.out.println("Your reversed number is "+ ans);
    }
}
