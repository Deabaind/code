class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i = 0; i < answer.length(); i++) {
            for (int j = i + 1; j < answer.length();) {
                if (answer.charAt(i) == answer.charAt(j)) {
                    answer.deleteCharAt(j);
                } else {
                    j++;
                }
            }
        }
        
        return answer.toString();
    }
}