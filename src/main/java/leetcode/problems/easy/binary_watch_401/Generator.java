package leetcode.problems.easy.binary_watch_401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generator {
    public static class HoursAndMinutes {
        int hour;
        int minute;

        public HoursAndMinutes(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<HoursAndMinutes>> bitCountToHoursAndMinutes = new HashMap<>();
        int maxBits = 0;
        for (int h = 0 ; h <= 11 ; h++) {
            for (int m = 0 ; m <= 59 ; m++) {
                int bitCount = Integer.bitCount(h) + Integer.bitCount(m);
                List<HoursAndMinutes> hoursAndMinutesList = bitCountToHoursAndMinutes.get(bitCount);
                if (hoursAndMinutesList == null) {
                    hoursAndMinutesList = new ArrayList<>();
                    bitCountToHoursAndMinutes.put(bitCount, hoursAndMinutesList);
                }
                hoursAndMinutesList.add(new HoursAndMinutes(h, m));
                if (maxBits < bitCount) {
                    maxBits = bitCount;
                }
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("switch (turnedOn) {\n");
        for (int bitCount = 0; bitCount <= maxBits; bitCount++) {
            stringBuilder.append("case " + bitCount + ":\n");
            List<HoursAndMinutes> hoursAndMinutesList = bitCountToHoursAndMinutes.get(bitCount);
            if (hoursAndMinutesList != null) {
                stringBuilder.append("return List.of(");
                for (int  i = 0; i < hoursAndMinutesList.size(); i++) {
                    HoursAndMinutes hoursAndMinutes = hoursAndMinutesList.get(i);
                    stringBuilder.append("\"");
                    stringBuilder.append(hoursAndMinutes.hour);
                    stringBuilder.append(":");
                    if (hoursAndMinutes.minute < 10) {
                        stringBuilder.append("0");
                    }
                    stringBuilder.append(hoursAndMinutes.minute + "\"");
                    if (i  < hoursAndMinutesList.size() - 1) {
                        stringBuilder.append(",\n");
                    }
                }
                stringBuilder.append(");\n");
            }
        }

        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }
}
