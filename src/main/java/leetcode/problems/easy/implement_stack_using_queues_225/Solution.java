package leetcode.problems.easy.implement_stack_using_queues_225;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class MyStack {
    List<Queue<Integer>> queues = List.of(new LinkedList<>(), new LinkedList<>());
    int iCurrentQueue = 0;
    int iOtherQueue = 1;

    public MyStack() {
    }

    public void push(int x) {
        queues.get(iCurrentQueue).add(x);
    }

    public int pop() {
        Queue<Integer> currentQueue = queues.get(iCurrentQueue);
        Queue<Integer> otherQueue = queues.get(iOtherQueue);
        while (true) {
            Integer val = currentQueue.poll();
            if (currentQueue.isEmpty()) {
                int copy = iOtherQueue;
                iOtherQueue = iCurrentQueue;
                iCurrentQueue = copy;
                assert val != null;
                return val;
            } else {
                otherQueue.add(val);
            }
        }
    }

    public int top() {
        Queue<Integer> currentQueue = queues.get(iCurrentQueue);
        Queue<Integer> otherQueue = queues.get(iOtherQueue);
        while (true) {
            Integer val = currentQueue.poll();
            otherQueue.add(val);
            if (currentQueue.isEmpty()) {
                int copy = iOtherQueue;
                iOtherQueue = iCurrentQueue;
                iCurrentQueue = copy;
                assert val != null;
                return val;
            }
        }
    }

    public boolean empty() {
        return queues.get(iCurrentQueue).isEmpty();
    }
}
