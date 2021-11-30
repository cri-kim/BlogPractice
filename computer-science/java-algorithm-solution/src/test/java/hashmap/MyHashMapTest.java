package hashmap;

import org.junit.jupiter.api.Test;

public class MyHashMapTest {
    @Test
    void myHashMapTest(){
        String[] methods = {"MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"};
        int[] keys={0,1,2,1,3,2,2,2,2};
        int[] values = {0,1,2,0,0,1,0,0,0};
        for(int i=0;i<methods.length;i++){
            instructor(methods[i],keys[i], values[i]);
        }
    }

    private void instructor(String method, int key, int value){
        MyHashMap obj = new MyHashMap();
        switch (method){
            case "MyHashMap":
                obj = new MyHashMap();
                break;
            case "put":
                obj.put(key, value);
                System.out.print("null");
                break;
            case "get":
                System.out.println(obj.get(key));
                obj.get(key);
                break;
            case "remove":
                obj.remove(key);
                System.out.print("null");
                break;
        }
    }
}
