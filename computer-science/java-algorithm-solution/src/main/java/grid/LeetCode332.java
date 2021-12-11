package grid;

import java.util.*;

//Eulerian Circuit = 한 붓 그리기
//못품...
public class LeetCode332 {

    private List<String> result;
    private Map<String, PriorityQueue<String>> map;
    private static String FIRST_AIRLINE="JFK";
    public List<String> findItinerary(List<List<String>> tickets) {
        result= new ArrayList<>();
        map = new HashMap<>();

        for(List<String> pair: tickets){
            String key = pair.get(0);
            String value = pair.get(1);
            if(!map.containsKey(key)){
                PriorityQueue<String> p = new PriorityQueue<>();
                p.add(value);
                map.put(key, p);
            }
            else{
                map.get(key).add(value);
            }
        }
        getPath(FIRST_AIRLINE);

        return result;
    }

    public void getPath(String begin){

        while(map.containsKey(begin) && map.get(begin).size() != 0 ){
            getPath(map.get(begin).poll());
        }
        result.add(0, begin);
    }
}
