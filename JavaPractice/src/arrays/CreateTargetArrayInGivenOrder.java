package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:
1.Initially target array is empty.
2.From left to right read nums[i] and index[i], insert at index[index[i]] the value nums[i] in target array.
3.Repeat the previous step until there are no elements to read in nums and index.
4.Return the target array.
It is guaranteed that the insertion operations will be valid.
 */
public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums, int[] index) {

//         USING ARRAYLIST
//        ArrayList<Integer>arr=new ArrayList<Integer>();
//        int[] ans=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//
//            arr.add(index[i],nums[i]);
//        }
//        for(int i=0;i<arr.size();i++){
//            ans[i]=arr.get(i);
//        }
//        return ans;

        //USING SIMPLE ARRAYS
        int[] target = new int[nums.length];
        int i = 0, k = 0;
        while (i < index.length) {
            for (k = target.length - 1; k > index[i]; k--)
                target[k] = target[k - 1];
            target[index[i]] = nums[i];
            i++;
        }
        return target;
    }
}
