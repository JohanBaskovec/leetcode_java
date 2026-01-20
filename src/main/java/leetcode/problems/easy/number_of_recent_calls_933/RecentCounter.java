package leetcode.problems.easy.number_of_recent_calls_933;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {
    List<Integer> calls = new ArrayList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        while (!calls.isEmpty() && calls.getFirst() < t - 3000) {
            calls.removeFirst();
        }
        calls.add(t);
        return calls.size();
    }
}
