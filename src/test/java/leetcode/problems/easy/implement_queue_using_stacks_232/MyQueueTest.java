package leetcode.problems.easy.implement_queue_using_stacks_232;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyQueueTest {
    @Test
    public void myQueueTest() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(5);
        myQueue.push(6);
        myQueue.push(7);
        assertEquals(5, myQueue.peek());
        int top = myQueue.pop();
        assertEquals(5, top);
        assertEquals(6, myQueue.peek());
        top = myQueue.pop();
        assertEquals(6, top);
        assertEquals(7, myQueue.peek());
        top = myQueue.pop();
        assertEquals(7, top);
        assertTrue(myQueue.empty());

        myQueue.push(8);
        assertEquals(8, myQueue.peek());
        top = myQueue.pop();
        assertEquals(8, top);
        assertTrue(myQueue.empty());
    }
}
