import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];
        
        for (int i = 0; i < a.length(); i++) {
            int b = a.length() - 1 - i;
            answer[i] = a.charAt(b) - '0';
        }        
        return answer;
    }
}