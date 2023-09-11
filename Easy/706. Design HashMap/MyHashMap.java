import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class MyHashMap {
    final int MAXCALL = 10000;
    List<Integer>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[MAXCALL];

        Arrays.fill(buckets, new LinkedList<>());
    }

    int hash(int key) {
        return key % MAXCALL;
    }

    public void put(int key, int value) {
        int i = hash(key);

        List<Integer> bucket = buckets[i];
        if (bucket.contains(key)) {
            bucket.set((Integer) key, value);
        }
        System.out.println(buckets);

    }

    public int get(int key) {
        int i = hash(key);

        List<Integer> bucket = buckets[i];
        if (bucket.contains(key)) {
            System.out.println(buckets);

            return bucket.get((Integer) key);
        }
        System.out.println(buckets);

        return -1;
    }

    public void remove(int key) {

        int i = hash(key);

        List<Integer> bucket = buckets[i];
        if (bucket.contains(key)) {
            bucket.remove((Integer) key);
        }
        System.out.println(buckets);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */