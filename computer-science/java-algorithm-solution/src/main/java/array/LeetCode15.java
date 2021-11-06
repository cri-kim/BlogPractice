package array;

import java.util.*;
/*
* 모르겠다....(1hour)
* 2021-11-06 // 시간은 초과하지않았지만 too long  
* */
public class LeetCode15 {
    public Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2 && nums[i] <= 0;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            twoSum(nums, i);
        }


        return new ArrayList<>(set);
    }

    public void twoSum(int[] nums, int i){
        for(int j=nums.length-1;j > i+1 ;j--){
            if(j < nums.length-1 && nums[j] == nums[j+1]) continue;
            int z = j-1;
            while(z > i && nums[i] + nums[j] + nums[z] >= 0){
                if(nums[i] + nums[j] + nums[z] == 0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[z]));
                }
                z--;
            }
        }

    }
}