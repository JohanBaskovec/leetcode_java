package leetcode.problems.easy.number_of_recent_calls_933;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecentCounterTest {

    @Test
    void ping() {
        RecentCounter recentCounter = new RecentCounter();
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(2));
        assertEquals(3, recentCounter.ping(3));
        assertEquals(4, recentCounter.ping(3000));
        assertEquals(5, recentCounter.ping(3001));
        assertEquals(5, recentCounter.ping(3002));
        assertEquals(5, recentCounter.ping(3003));
        assertEquals(5, recentCounter.ping(3004));
        assertEquals(2, recentCounter.ping(6004));
        assertEquals(1, recentCounter.ping(12000));
    }
}