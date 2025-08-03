package leetcode.problems.easy.palindrome_linked_list_234;

import leetcode.library.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isPalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(ListNode.fromStringReprensentation("[1,2,3,2,1]")));
        assertTrue(solution.isPalindrome(ListNode.fromStringReprensentation("[1,2,3,3,2,1]")));
        assertFalse(solution.isPalindrome(ListNode.fromStringReprensentation("[1,2,3,4,2,1]")));
    }
}