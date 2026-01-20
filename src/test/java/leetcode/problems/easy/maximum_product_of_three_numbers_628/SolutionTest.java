package leetcode.problems.easy.maximum_product_of_three_numbers_628;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maximumProduct() {
        Solution s = new Solution();
        assertEquals(6, s.maximumProduct(new int[]{1, 2, 3}));
        assertEquals(24, s.maximumProduct(new int[]{1, 2, 3, 4}));
        assertEquals(-6, s.maximumProduct(new int[]{-1,-2,-3}));
        assertEquals(12, s.maximumProduct(new int[]{1,2,-1,-2,-3}));
        assertEquals(0, s.maximumProduct(new int[]{-20,0,10,20}));
        assertEquals(2000, s.maximumProduct(new int[]{-20,-10,10}));
        assertEquals(2000, s.maximumProduct(new int[]{-20,-10,-5,10}));
        assertEquals(2000, s.maximumProduct(new int[]{-20,-10,-5,0,10}));
        assertEquals(-1000, s.maximumProduct(new int[]{-20,-10,-5}));
        assertEquals(-50, s.maximumProduct(new int[]{-20,-10,-5,-1}));
        assertEquals(-6, s.maximumProduct(new int[]{-1,-2,-3,-4}));
        assertEquals(972256230, s.maximumProduct(new int[]{-710,-107,-851,657,-14,-859,278,-182,-749,718,-640,127,-930,-462,694,969,143,309,904,-651,160,451,-159,-316,844,-60,611,-169,-73,721,-902,338,-20,-890,-819,-644,107,404,150,-219,459,-324,-385,-118,-307,993,202,-147,62,-94,-976,-329,689,870,532,-686,371,-850,-186,87,878,989,-822,-350,-948,-412,161,-88,-509,836,-207,-60,771,516,-287,-366,-512,509,904,-459,683,-563,-766,-837,-333,93,893,303,908,532,-206,990,280,826,-13,115,-732,525,-939,-787}));


    }
}