package leetcode.problems.easy.minimum_index_sum_of_two_lists_599;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findRestaurant() {
        Solution solution = new Solution();
        assertArrayEquals(new String[]{"Shogun"}, solution.findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));
        assertArrayEquals(new String[]{"Shogun"}, solution.findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"KFC","Shogun","Burger King"}));
        assertArrayEquals(new String[]{"sad", "happy"}, solution.findRestaurant(new String[]{"happy","sad","good"}, new String[]{"sad","happy","good"}));
        assertArrayEquals(new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"}, solution.findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"}, new String[]{"KFC","Burger King","Tapioca Express","Shogun"}));
        assertArrayEquals(new String[]{"Piatti"}, solution.findRestaurant(new String[]{"Shogun","Piatti","Tapioca Express","Burger King","KFC"}, new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));
        assertArrayEquals(new String[]{"KFC"}, solution.findRestaurant(new String[]{"vacag","KFC"}, new String[]{"fvo","xrljq","jrl","KFC"}));

    }
}