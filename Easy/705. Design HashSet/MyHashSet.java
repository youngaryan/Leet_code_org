import java.util.ArrayList;
import java.util.List;

class MyHashSet {

    private List<Integer> integers = new ArrayList<>();

    public MyHashSet() {

    }

    public void add(int key) {
        if (!integers.contains(key)) {
            integers.add(key);
        }
    }

    public void remove(int key) {
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == key) {
                integers.remove(i);
                break;
            }
        }
    }

    public boolean contains(int key) {
        return integers.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */