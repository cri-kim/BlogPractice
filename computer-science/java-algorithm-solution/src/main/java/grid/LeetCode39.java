package grid;


import java.util.ArrayList;
import java.util.List;

//20분 컷!...앞에 푼거 거의 외워서 ㅜㅜㅜ
//코테는 암기인가?
public class LeetCode39 {
    private static List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();

        backtracking(new ArrayList<>(), target, 0, candidates);
        return result;
    }

    public void backtracking(List<Integer> list, int target, int i, int[] candidates){
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        if(sum == target){
            System.out.println(list.toString());
            result.add(new ArrayList<>(list));
            return;
        }
        if(sum > target){
            return;
        }

        for(int t=i;t<candidates.length;t++){
            if(target < sum + candidates[t]){
                continue;
            }
            list.add(candidates[t]);
            backtracking(list, target, t, candidates);
            list.remove(list.size() - 1);
        }
    }
}
