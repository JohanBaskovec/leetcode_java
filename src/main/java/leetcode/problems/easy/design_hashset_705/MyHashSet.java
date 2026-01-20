package leetcode.problems.easy.design_hashset_705;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private final int space = 10000;
    private final List<Integer>[] data = new  List[space];
    public MyHashSet() {

    }

    public void add(int key) {
        int mod = key % space;
        List<Integer> bucket = data[mod];
        if (bucket == null) {
            data[mod] = new ArrayList<>();
            bucket = data[mod];
        }
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int mod = key % space;
        if (data[mod] == null) {
            return;
        }
        data[mod].removeAll(List.of(key));
    }

    public boolean contains(int key) {
        int mod = key % space;
        return data[mod] != null && data[mod].contains(key);
    }
}
