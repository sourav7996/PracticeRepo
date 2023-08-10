package firstJava_02;
import java.util.Scanner;

//7.To calculate Fibonacci Series up to n numbers.
public class Problem_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series: ");
        int n = sc.nextInt();
        System.out.println("Method1:->>>");
        for(int i =0; i<n;i++){
            System.out.print(fibonacci_method1(i)+ " ");
        }
        System.out.println(" ");
        System.out.println("Method2:->>>");
        fibonacci_method2(n);
    }

    public static int fibonacci_method1(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return fibonacci_method1(n-2)+fibonacci_method1(n-1);
        }
    }

     static void fibonacci_method2(int n){
        int a=0, b=1, i;
         System.out.print(a+" ");
        if (n<1)
            return;
        for (i=1;i<n;i++){
            System.out.print(b+" ");
            int next = a+b;
            a=b;
            b=next;
        }

    }
}
