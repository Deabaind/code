import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] answer = my_string.toCharArray();
        
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] >= 'A' && answer[i] <= 'Z') {
                answer[i] += 32;
            }
        }
        Arrays.sort(answer);
        return new String(answer);
    }
}