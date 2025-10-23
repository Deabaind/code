class Solution {
    public String solution(int age) {
        String ageStr = String.valueOf(age);
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < ageStr.length(); i++) {
            answer.append((char)(ageStr.charAt(i) + 49));
        }
        return answer.toString();
    }
}