class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        
        String[] array = s.split(" ");
        
        for (String str : array) {
            if (str.equals("Z")) {
                answer -= num;
            } else {
                num = Integer.valueOf(str);
                answer += num;
            }
        }
        return answer;
    }
}