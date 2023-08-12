package conditionals_loops_03;

//import java.util.ArrayList;
import java.util.Scanner;

public class SubtractOfProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        int ans = answer(number);//calling the calculator method for getting answer.
        System.out.println("Subtraction of the Product and Sum of Digits of the number is: "+ans);
    }

    static int answer(int number){
        int temp = number;
        int product = 1;
        int sum = 0;
        while (temp!=0){
            int rem = temp%10;
            sum+=rem;
            product*=rem;
            temp/=10;
        }
        return product-sum;
    }



    //the calculator method for getting answer.
//    static int answer(int number) {
//        //calling the arrayList creator method to get the array of digits.
//        ArrayList<Integer> digits =  arrayOfDigits(number);
//        // calling the sum calculator method and passing the arrayList in it.
//        int sum = SumOfDigits(digits);
//        // calling the product calculator method and passing the arrayList in it.
//        int product = productOfDigits(digits);
//        return product-sum;
//    }


//
//    //product calculator method.
//    static int productOfDigits(ArrayList<Integer> digits) {
//        int product =1;
//        for (Integer digit : digits) {
//            product *= digit;
//        }
//        return product;
//    }
//
//
//
//    //sum calculator method.
//    static int SumOfDigits(ArrayList<Integer> digits) {
//        int sum =0;
//        for (Integer digit : digits) {
//            sum += digit;
//        }
//        return sum;
//    }
//
//
//    //Method to get arrayList of the digits.
//    static ArrayList<Integer> arrayOfDigits(int number){
//        ArrayList<Integer> digitArrays = new ArrayList<>();
//        int temp = number;
//        while (temp!=0){
//            int rem = temp%10;
//            digitArrays.add(rem);
//            temp/=10;
//        }
//        return digitArrays;
//    }
}
