package firstJava_02;

import java.util.Scanner;

//9.series of armstrong number.
public class Problem_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number =sc.nextInt();
//        long start = System.nanoTime();
        int numberOrder = order(number);
        boolean ans = isArmstrong(number,numberOrder);
        System.out.println(ans);
//        long end = System.nanoTime();
//        System.out.println("the execution time: "+ (end-start)+ "nanoseconds");
    }

    static int order(int n){
        int ord = 0;
        while (n != 0) {
            ord++;
            n=n/10;
        }
        return ord;
    }

    static boolean isArmstrong(int num, int ord){
        int sum = 0;
        int temp = num;
        while (temp!=0){
            int rem=temp%10;
            sum = sum +power(rem,ord);
            temp/=10;
        }
        if(num == sum)
            return true;
        return false;
    }

    private static int power(int rem, int ord) {
        int powAnswer=1;
        if(ord == 0){
            return 1;
        }else{
        while (ord!=0){
            powAnswer*=rem;
            ord--;
        }
        return powAnswer;
        }
    }

}
