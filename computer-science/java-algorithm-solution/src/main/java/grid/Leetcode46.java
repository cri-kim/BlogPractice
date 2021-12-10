package grid;

import java.util.ArrayList;
import java.util.List;

//근접했는데 못품 ㅜㅜㅠㅜㅠ못품!!!!
public class Leetcode46 {

    public List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        dfs(nums, new ArrayList<>());

        return result;
    }

    public void dfs(int[] nums, List<Integer> list){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i : nums){
            if(list.contains(i)){
                continue;
            }
            list.add(i);
            dfs(nums,list);
            list.remove(list.size()-1);
        }

    }
}
