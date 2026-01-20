package leetcode.problems.easy.unique_email_address_929;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<String>();
        for (String email : emails) {
            String[] parts =  email.split("@");
            String localPart = parts[0];
            String domainName = parts[1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < localPart.length(); i++) {
                char c = localPart.charAt(i);
                if (c == '.') {
                    continue;
                } else if (c == '+') {
                    break;
                }
                sb.append(c);
            }
            sb.append("@");
            sb.append(domainName);
            uniqueEmails.add(sb.toString());
        }
        return uniqueEmails.size();
    }
}
