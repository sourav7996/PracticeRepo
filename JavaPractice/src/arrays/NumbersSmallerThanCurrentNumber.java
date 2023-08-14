package arrays;

import java.util.Arrays;

/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 */
public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {7, 7, 7, 7};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
//        int [] counter = new int[nums.length];
//        for (int i = 0; i<nums.length;i++){
//            for (int j = 0; j <nums.length ; j++) {
//                if(nums[i]>nums[j] && (i!=j)){
//                    counter[i]+=1;
//                }
//            }
//        }
//        return counter;
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i])
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }

}
