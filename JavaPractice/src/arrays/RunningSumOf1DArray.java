package arrays;

import java.util.Arrays;

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
 */
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 6};
        int[] sum = runningSum(arr);
        System.out.println(Arrays.toString(sum));
    }

    static int[] runningSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        return arr;
    }
}
