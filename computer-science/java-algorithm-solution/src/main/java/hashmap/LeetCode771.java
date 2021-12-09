package hashmap;

public class LeetCode771 {

    public int numJewelsInStones(String jewels, String stones) {
        char[] chars = stones.toCharArray();
        int cnt = 0;
        for(int i=0;i<stones.length();i++){
            if(jewels.contains(String.valueOf(stones.charAt(i)))){
                cnt++;
            }
        }
        return cnt;
    }
}
