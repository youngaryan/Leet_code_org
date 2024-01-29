import java.util.Stack;

class MyQueue {
    private Stack<Integer> head;
    private Stack<Integer> tail;

    public MyQueue() {
        head = new Stack<>();
        tail = new Stack<>();
    }

    public void push(int x) {
        for (int i = 0; i < tail.size(); i++) {
            head.add(tail.pop());
        }

        for (int i = 0; i < head.size(); i++) {
            tail.add(head.pop());

        }
        tail.add(x);
    }

    public int pop() {
        for (int i = 0; i < tail.size(); i++) {
            head.add(tail.pop());
        }
        int r = head.pop();
        for (int i = 0; i < head.size(); i++) {
            tail.add(head.pop());

        }
        return r;
    }

    public int peek() {
        for (int i = 0; i < tail.size(); i++) {
            head.add(tail.pop());
        }
        int r = head.peek();
        for (int i = 0; i < head.size(); i++) {
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