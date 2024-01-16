import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {

    private HashMap<Integer, Integer> hashMap;
    private ArrayList<Integer> arrayList;
    private Random random;

    public RandomizedSet() {
        hashMap = new HashMap<>();
        arrayList = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        boolean insert = !hashMap.containsKey(val);

        if (insert) {
            hashMap.put(val, arrayList.size());
            arrayList.add(val);
        }
        return insert;
    }

    public boolean remove(int val) {
        boolean remove = hashMap.containsKey(val);

        if (remove) {
            int index = hashMap.get(val);
            int lastIndex = arrayList.size() - 1;
            int lastValue = arrayList.get(lastIndex);
            arrayList.set(index, lastValue);
            arrayList.remove(lastIndex);
            hashMap.put(lastValue, index);
            hashMap.remove(val);
        }

        return remove;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(0, arrayList.size());

        return arrayList.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */