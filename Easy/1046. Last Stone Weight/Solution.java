import java.util.PriorityQueue;
public class Solution {
    //maxheap
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones)
            maxHeap.add(stone);

        while (maxHeap.size()>1){
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if (stone2 != stone1)
                maxHeap.add(stone1-stone2);
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.remove();
    }
}
