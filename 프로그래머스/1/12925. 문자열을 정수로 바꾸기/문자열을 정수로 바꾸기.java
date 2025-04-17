class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean sign = true;
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            if (value == '-') {
                sign = false;
            } 
            else if (value != '+') {
                answer = answer * 10 + (value - '0');
            }
        }
        if (sign == false) {
            answer *= -1;
        }
        return answer;
    }
}