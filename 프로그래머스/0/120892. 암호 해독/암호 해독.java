class Solution {
    public String solution(String cipher, int code) {
        char[] answerArr = new char[cipher.length() / code] ;
        
        for (int i = 1; i <= cipher.length() / code; i++) {
            answerArr[i - 1] = cipher.charAt(i * code - 1);
        }
    
        return String.valueOf(answerArr);
    }
}