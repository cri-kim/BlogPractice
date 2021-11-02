package array;

import java.util.Arrays;
//5minuts
public class LeetCode561 {
    public int arrayPairSum(int[] nums) {
        int rs = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i = i+2){
            rs += Math.min(nums[i],nums[i+1]);
        }
        return rs;
    }
}
