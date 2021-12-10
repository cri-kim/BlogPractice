package grid;

import java.util.ArrayList;
import java.util.List;

//15분컷......코테는 암기다 ㅡㅡ
public class LeetCode78 {

    public static List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        //0 ~ nums.length 만큼의 subset 생성
        for(int i=0;i<=nums.length;i++){
            backtracking(new ArrayList<>(), nums, 0, i);
        }
        return result;
    }
    public void backtracking(List<Integer> list, int[] nums, int target, int k){
        if(list.size() == k){
            System.out.println(list.toString());
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=target; i < nums.length ; i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            backtracking(list, nums, i, k);
            list.remove(list.size()-1);
        }
    }
}
