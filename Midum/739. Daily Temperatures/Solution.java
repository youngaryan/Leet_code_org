import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        stack.add(0);

        for (int i = 1; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                result[stack.peek()] = i - stack.pop();
            }

            stack.push(i);
        }

        return result;
    }
}

// [1,1,4,2,1,1,0,0]