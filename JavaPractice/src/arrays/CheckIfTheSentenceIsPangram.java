package arrays;
/*
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean output = checkIfPangram(sentence);
        System.out.println(output);
    }

    static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            int val = sentence.charAt(i) - 97; // As value of 'a' is 97

            arr[val] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }

        return true;
    }
}
