public class Main {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();

        hashMap.put(11, 0);
        System.out.println(hashMap.get(11));
    }
}

/*
 * class MyHashMap {
 * 
 * public MyHashMap() {
 * 
 * }
 * 
 * public void put(int key, int value) {
 * 
 * }
 * 
 * public int get(int key) {
 * 
 * }
 * 
 * public void remove(int key) {
 * 
 * }
 * }
 * 
 * /**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */