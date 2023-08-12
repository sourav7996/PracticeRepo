package conditionals_loops_03;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class LargestNumberFromInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int temp = 0;
        System.out.println("Please Enter the numbers: ");
        do{
            num = in.nextInt();
            if(num>temp){
                temp=num;
            }
        }while (num!=0);
        System.out.printf("the largest number you have entered is: %d",temp);
    }
}
