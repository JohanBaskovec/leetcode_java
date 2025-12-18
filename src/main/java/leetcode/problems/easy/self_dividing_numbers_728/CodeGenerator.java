package leetcode.problems.easy.self_dividing_numbers_728;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {
    public static void main(String[] args) {
        List<Integer> selfDividingsNumbes = selfDividingNumbers(1, 10000);
        StringBuilder sb = new StringBuilder();
        sb.append("switch (n) {\n");
        for (Integer number : selfDividingsNumbes) {
            sb.append("\tcase " + number + ":\n");
        }
        sb.append("\tret.add(n);\n");
        sb.append("\tbreak;\n");
        sb.append("\tdefault:\n");
        sb.append("\tbreak;\n");
        sb.append("}\n");
        System.out.println(sb);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int rest = i;
            boolean divisibleByAllDigits = true;
            while (rest > 0) {
                int digit = rest % 10;
                if (digit == 0 || i % digit != 0) {
                    divisibleByAllDigits = false;
                    break;
                } else {
                    rest /= 10;
                }
            }
            if (divisibleByAllDigits) {
                result.add(i);
            }
        }
        return result;

    }
}
