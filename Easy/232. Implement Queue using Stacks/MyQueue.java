import java.util.Stack;

class MyQueue {
    private Stack<Integer> head;
    private Stack<Integer> tail;

    public MyQueue() {
        head = new Stack<>();
        tail = new Stack<>();
    }

    public void push(int x) {
        tail.add(x);
    }

    public int pop() {
        int size = tail.size();
        for (int i = 0; i < size; i++) {
            head.add(tail.pop());
        }
        int r = head.pop();
        for (int i = 0; i < size - 1; i++) {
            tail.add(head.pop());

        }
        return r;
    }

    public int peek() {
        int size = tail.size();

        for (int i = 0; i < size; i++) {
            head.add(tail.pop());
        }
        int r = head.peek();
        for (int i = 0; i < size; i++) {
            tail.add(head.pop());

        }
        return r;
    }

    public boolean empty() {
        return tail.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

/*
 * Input
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 1, 1, false]
 */