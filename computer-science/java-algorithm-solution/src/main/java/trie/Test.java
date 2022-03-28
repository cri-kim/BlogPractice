package trie;

import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.util.*;
class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] containers = new int[cnt];
        for(int i=0;i<cnt;i++){
            containers[i] = Integer.parseInt(br.readLine());
        }
        int result = getHightestFloor(cnt, containers);
        System.out.println(result);
    }

    private static List<Integer> negativeElements = new ArrayList<>();
    private static List<Integer> positiveElements = new ArrayList<>();
    private static Set<Integer> removedElements = new HashSet<>();

    public static int getHightestFloor(int cnt, int[] sizes){

        int max = 0;
        removedElements.add(0);

        for(int i=0;i<cnt;i++){
            if(sizes[i] > 0 ){
                positiveElements.add(sizes[i]);
            }else{
                negativeElements.add(Math.abs(sizes[i]));
            }
        }

        boolean isPositive = positiveElements.size() > negativeElements.size();
        int n = isPositive? negativeElements.size() :positiveElements.size();

        Collections.sort(negativeElements);
        Collections.sort(positiveElements);

        int prev = 0;
        for(int i=0;i<n;i++){
            if(isPositive){
                max += calculateFloor(prev,negativeElements.get(i), positiveElements);
                prev = negativeElements.get(i);
            } else{
                max += calculateFloor(prev,positiveElements.get(i), negativeElements);
                prev = positiveElements.get(i);
            }
        }
        return max;
    }
    public static int calculateFloor(int prev, int num, List<Integer> elements){
        int rs = elements.stream().filter(n -> n <= num && n >= prev &&  !removedElements.contains(n))
                .mapToInt(x->x)
                .min().orElse(0);
        System.out.println(prev+","+rs);
        if(prev == 0 && rs == 0) return 1;
        if(prev == 0 ) return 2;
        if(prev > 0 && rs == 0) return 0;
        return 1;
    }
    public static boolean hasSmallNum(int num, Set<Integer> elements){
        return elements.stream().anyMatch(a->a >= num);
    }
}
