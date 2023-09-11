import java.util.LinkedList;
import java.util.List;

class MyHashSet {
    List<Integer>[] buckets;
    private final int CAPACITY = 10000;

    public MyHashSet() {
        buckets = new LinkedList[CAPACITY];

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public int hash(int key) {
        return key % CAPACITY;
    }

    public void add(int key) {
        if (contains(key)) {
            return;
        }
        int index = hash(key);

        List<Integer> bucket = buckets[index];
        bucket.add(key);

    }

    public void remove(int key) {
        if (contains(key)) {
            int index = hash(key);

            List<Integer> bucket = buckets[index];

            bucket.remove((Integer) key);
        }
    }

    public boolean contains(int key) {
        int index = hash(key);

        List<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */