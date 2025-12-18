package leetcode.problems.easy.implement_queue_using_stacks_232;

import java.util.Stack;

class MyQueue {
    private final Stack<Integer> mainStack = new Stack<>();
    private final Stack<Integer> tempStack = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        mainStack.push(x);
    }

    public int pop() {
        while (true) {
            Integer i = mainStack.pop();
            if (mainStack.empty()) {
                while (!tempStack.empty()) {
                    mainStack.push(tempStack.pop());
                }
                return i;
            }
            tempStack.push(i);
        }
    }

    public int peek() {
        while (true) {
            Integer i = mainStack.pop();
            tempStack.push(i);
            if (mainStack.empty()) {
                while (!tempStack.empty()) {
                    mainStack.push(tempStack.pop());
                }
                return i;
            }
        }
    }

    public boolean empty() {
        return mainStack.empty();
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
