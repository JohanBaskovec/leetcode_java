package leetcode.problems.easy.design_hashmap_706;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {
    @Test
    void get() {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1,1);
        assertEquals(1,hashMap.get(1));
        assertEquals(-1, hashMap.get(5));
        hashMap.put(5,4);
        assertEquals(4,hashMap.get(5));
        hashMap.remove(1);
        assertEquals(-1, hashMap.get(1));
    }

}