package leetcode.problems.easy.design_hashset_705;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {
    @Test
    void add() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        assertTrue(myHashSet.contains(1));
        assertTrue(myHashSet.contains(2));
        assertFalse(myHashSet.contains(3));
        myHashSet.add(3);
        assertTrue(myHashSet.contains(3));
        myHashSet.remove(4);
        myHashSet.remove(3);
        assertFalse(myHashSet.contains(3));
    }

}