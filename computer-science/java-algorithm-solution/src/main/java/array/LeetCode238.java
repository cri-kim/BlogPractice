package array;
//7분
public class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {
        int zeroCnt = 0;
        int multi = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroCnt++;
                continue;
            }
            multi *= nums[i];
        }
        if(zeroCnt > 1){
            multi = 0;
        }

        for(int i=0;i<nums.length;i++){
            if(zeroCnt == 1){
                if(nums[i] == 0){
                    nums[i] = multi;
                    continue;
                }
                nums[i] = 0;
                continue;
            }
            if(zeroCnt > 1){
                nums[i] = 0;
                continue;
            }
            nums[i] = multi / nums[i];
        }
        return nums;
    }
}
