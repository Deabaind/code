import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String n = my_string.replaceAll("[^0-9]", "");
        
        for (int i = 0; i < n.length(); i++) {
            answer += Integer.valueOf(n.substring(i, i + 1));
        }
        return answer;
    }
}