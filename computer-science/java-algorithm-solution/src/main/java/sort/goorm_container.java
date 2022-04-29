package sort;

import java.util.*;

public class goorm_container {
    public int solve(int cnt, int[] sizes){
        Set<Integer> negativeElements = new HashSet<>();
        Set<Integer> positiveElements = new HashSet<>();
        int max = 0;
        for(int i=0;i<cnt;i++){
            if(sizes[i] > 0){
                positiveElements.add(sizes[i]);
            }
            else{
                negativeElements.add(sizes[i]);
            }
        }

        boolean isPositive = positiveElements.size() > negativeElements.size();
        int n = isPositive ? negativeElements.size():positiveElements.size();

        for(int i=0;i<n;i++){
            int temp = 0;
            if(isPositive){
              //  temp = negativeElements.get(i);
            }else{
              //  temp = positiveElements.get(i);
            }
        }

        return -1;
    }
//    public int getHighestFloor(Set<Integer> aElements, Set<Integer> bElements){
//        int floor = 0;
//        List<Integer> aList = new ArrayList<>(aElements);
//        Collections.sort(aList);
//        int prev=0;
//        for(int item : aList){
//            int cur = Math.abs(item);
//            bElements.stream().filter(a->Math.abs(a) <= cur);
//
//        }
//    }
    public boolean hasHigherFloor(int temp, Set<Integer> elements){
        return elements.stream().anyMatch(a -> a >= temp);
    }
}
