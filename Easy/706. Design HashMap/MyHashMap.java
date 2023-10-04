import java.util.HashSet;
import java.util.Set;

class MyHashMap {

    int[] hashMap = new int[1000];
    Set<Integer> keysUsed = new HashSet<>();

    public MyHashMap() {
    }

    public void put(int key, int value) {
        hashMap[key] = value;
        keysUsed.add(key);
    }

    public int get(int key) {
        if (hashMap[key] != 0 || keysUsed.contains(key)) {
            return hashMap[key];
        }
        return -1;
    }

    public void remove(int key) {
        hashMap[key] = 0;
        keysUsed.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */