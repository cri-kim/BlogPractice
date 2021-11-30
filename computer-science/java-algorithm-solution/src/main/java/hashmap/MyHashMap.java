package hashmap;

public class MyHashMap {

    private int[] arr;
    public MyHashMap() {
        arr = new int[10000000];
        for(int i=0;i<arr.length;i++){
            arr[i] = -1;
        }
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }
}
