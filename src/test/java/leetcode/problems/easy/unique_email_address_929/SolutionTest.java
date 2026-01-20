package leetcode.problems.easy.unique_email_address_929;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numUniqueEmails() {
        Solution s = new Solution();
        assertEquals(2,s.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
        assertEquals(3,s.numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
        assertEquals(1, s.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"}));

    }
}