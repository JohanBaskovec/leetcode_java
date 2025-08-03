package leetcode.problems.easy.reverse_string_344;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void reverseString() {
        Solution solution = new Solution();
        char[] chars0 = new char[]{'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        solution.reverseString(chars0);
        assertArrayEquals(new char[]{'a','m','a','n','a','P',' ',':','l','a','n','a','c',' ','a',' ',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A'}, chars0);
    }
}