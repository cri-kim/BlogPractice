package java.map;

import java.util.HashMap;
import java.util.Map;

//leetcode Map Sum Paris

//MapSum() Initializes the MapSum object.
//void insert(String key, int val) Inserts the key-val pair into the map.
//If the key already existed, the original key-value pair will be overridden to the new one.
//int sum(string prefix) Returns the sum of all the pairs' value whose key starts with the prefix.

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */

public class Leetcode677 {
	Map<String, Integer> map;
    /** Initialize your data structure here. */
    public MapSum() {
    	map = new HashMap<String, Integer>();
    }
    
    public void insert(String key, int val) {
    	map.put(key, val);
    }
    
    public int sum(String prefix) {
    	int sum=0;
    	for(String key : map.keySet()) {
    		if(key.startsWith(prefix)) {
    			sum+=map.get(key);
    		}
    	}
    	return sum;
    }
}
