package grid;

import java.util.ArrayList;
import java.util.List;
// 2시간
//이전에 순열...보고진행함
public class LeetCode77 {

    public List<List<Integer>> result;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        backtracking(new ArrayList<>(), n, k, 1);

        return result;
    }

    public void backtracking(List<Integer> list, int n, int k, int start){
        if(list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<=n;i++){
            list.add(i);
            backtracking(list, n,k,i+1);
            list.remove(list.size()-1);
        }
    }
}
