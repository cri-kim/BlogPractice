package hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class Leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] rs = new int[k];
        Map<Integer, Integer> fruquentElements = new HashMap<>();
        for(int num : nums){
            if(fruquentElements.containsKey(num)){
                int cnt = fruquentElements.get(num)+1;
                fruquentElements.put(num, cnt);
                continue;
            }
            fruquentElements.put(num, 1);
        }
        List<Integer> list = fruquentElements.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer> comparingByValue().reversed())
                .map(x->x.getKey())
                .collect(Collectors.toList());

        for(int i=0;i<k;i++){
            rs[i] = list.get(i);
        }

        return rs;
    }
}
