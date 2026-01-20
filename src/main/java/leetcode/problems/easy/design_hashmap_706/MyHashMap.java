package leetcode.problems.easy.design_hashmap_706;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    private class KeyValue {
        private final int key;
        private int value;

        public KeyValue(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    private final int space = 10000;
    private final List<KeyValue>[] data = new  List[space];

    public MyHashMap() {

    }

    public void put(int key, int value) {
        int mod = key % space;
        List<KeyValue> bucket = data[mod];
        if (bucket == null) {
            data[mod] = new ArrayList<>();
            bucket = data[mod];
        }
        for (KeyValue kv : bucket) {
            if (kv.getKey() == key) {
                kv.setValue(value);
                return;
            }
        }
        bucket.add(new KeyValue(key, value));
    }

    public int get(int key) {
        int mod = key % space;
        List<KeyValue> bucket = data[mod];
        if (bucket == null) {
            return -1;
        }
        for (KeyValue kv : bucket) {
            if (kv.getKey() == key) {
                return kv.getValue();
            }
        }
        return -1;
    }

    public void remove(int key) {
        int mod = key % space;
        List<KeyValue> bucket = data[mod];
        if (bucket != null) {
            for (int i = 0; i < bucket.size(); i++) {
                if (bucket.get(i).getKey() == key) {
                    bucket.remove(i);
                    return;
                }
            }
        }
    }
}
