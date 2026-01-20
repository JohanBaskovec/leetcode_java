package leetcode.problems.easy.student_attendance_record_i_551;

class Solution {
    public boolean checkRecord(String s) {
        char[] chars =  s.toCharArray();
        int lates = 0;
        int absences = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L') {
                lates++;
                if (lates == 3) {
                    return false;
                }
            } else if (chars[i] == 'A') {
                lates = 0;
                absences++;
                if (absences == 2) {
                    return false;
                }
            } else {
                lates = 0;
            }
        }
        return true;
    }
}
