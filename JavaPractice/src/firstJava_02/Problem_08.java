package firstJava_02;
import java.util.Scanner;

//8.To find out whether the given String is Palindrome or not.
public class Problem_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check if Palindrome or not: ");
        String input = sc.next();
        isPalindrome1(input);
        isPalindrome2(input);
        if(isPalindrome3(input)){
            System.out.println("The given word is Palindrome from Method3");
        }
        else {
            System.out.println("The given word is not Palindrome from Method3");
        }

    }

    public static void isPalindrome1(String input){
        String word = input.toLowerCase();
        String revWord ="" ;
        for(int i =word.length()-1;i>=0;i--){
            revWord= revWord+ word.charAt(i);
        }
        if(word.equals(revWord)){
            System.out.println("The given word is Palindrome from Method1");
        }else {
            System.out.println("The given word is not Palindrome from Method1");
        }
    }

    public static void isPalindrome2(String input){
        String word = input.toLowerCase();
        StringBuilder revWord = new StringBuilder();// changed from:===>>> String revWord ="" ;
        for(int i =word.length()-1;i>=0;i--){
            revWord.append(word.charAt(i));//changed from:==>>>  revWord= revWord+ word.charAt(i);
        }
        if(word.contentEquals(revWord)){//changed from:==>>>  word.equals(revWord)
            System.out.println("The given word is Palindrome from Method2");
        }else {
            System.out.println("The given word is not Palindrome from Method2");
        }
    }

    public static boolean isPalindrome3(String input){
        String word = input.toLowerCase();
        int i = 0, j=word.length()-1;
        while (i<j){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
