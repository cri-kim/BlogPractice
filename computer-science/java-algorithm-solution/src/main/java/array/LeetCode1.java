package array;

//5minutes
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] rs = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    rs[0]=i;
                    rs[1]=j;
                    break;
                }
            }
        }
        return rs;
    }
}
