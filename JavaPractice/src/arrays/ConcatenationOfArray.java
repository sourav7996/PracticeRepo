package arrays;

import java.util.Arrays;

/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
 */
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 8, 105};
//        long start = System.nanoTime();
        int[] ans = getConcatenation(nums);
        //int[] ans = getConcatenation(nums);
//        long end = System.nanoTime();
//        System.out.println( (end - start) + "ms");
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length) * 2];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
//    public int[] getConcatenation2(int[] nums) {
//        int len = nums.length;
//        int[] ans = new int[2*len];
//        for(int i = 0; i < len; i++){
//            ans[i] = nums[i];
//            ans[i+len] = nums[i];
//        }
//        System.gc();
//        return ans;
//    }
}
