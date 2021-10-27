package string;

import java.util.*;

public class LeetCode819 {
    private static final String DELIMETER = "[^a-zA-Z]|\\s";
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<String,Integer>();
        Set<String> set = Set.of(banned);
        for(String s : paragraph.split(DELIMETER)){
            String word = s.toLowerCase();
            if(set.contains(word)||s.isBlank()){
                continue;
            }
            int cnt = (map.containsKey(word) ? map.get(word) : 0) + 1;
            map.put(word, cnt);
        }

        Optional<Map.Entry<String, Integer>> max
                = map.entrySet().stream().max(Map.Entry.comparingByValue());
        return max.get().getKey();
    }
}
