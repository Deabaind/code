class Solution {
    public static String rspPlay(char c) {
        if (c == '0') return "5";
        if (c == '2') return "0";
        return "2";
    }
    
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            answer += rspPlay(rsp.charAt(i));
        }
        return answer;
    }
}