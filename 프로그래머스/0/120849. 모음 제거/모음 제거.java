class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] vowel = {"a", "e", "i", "o", "u"};
        
        for (String v : vowel) {
            answer = answer.replace(v, "");
        }
        return answer;
    }
}