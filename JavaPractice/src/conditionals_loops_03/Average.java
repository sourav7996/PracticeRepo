package conditionals_loops_03;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int counter = 0;
        int sum =0;
        System.out.println("Please enter the numbers of which average is required: ");
        while (true) {
            num = in.nextInt();
            if(num!=0){
                sum += num;
                counter++;
            }else {
                break;
            }
        }
        int avg = sum/counter;
        System.out.println("The average is: "+ avg);
    }
}
