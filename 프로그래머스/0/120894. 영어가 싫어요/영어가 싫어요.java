import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        Map<String,Long> numberMap = new HashMap<>();
        String[] engNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        long count = 0;
        
        for (String str : engNumbers) {
            numberMap.put(str, count);
            count++;
        }
        
        int index = 0;
        
        while (index < numbers.length()) {
            for (Map.Entry<String, Long> entry : numberMap.entrySet()) {
                if (numbers.startsWith(entry.getKey(), index)) {
                    answer += entry.getValue();
                    answer *= 10;
                    index += entry.getKey().length();
                }
            }
        }
        return answer /= 10;
    }
}