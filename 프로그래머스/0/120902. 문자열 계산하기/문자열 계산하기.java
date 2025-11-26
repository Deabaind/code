class Solution {
    public static int isSign(String str) {
        if (str.equals("+")) {
            return +1;
        }
        return -1;
    }
    
    public int solution(String my_string) {
        String[] array = my_string.split(" ");
        int answer = 0;
        int num = 1;
        
        for (String str : array) {
            if (str.equals("+") || str.equals("-")) {
                num = isSign(str);
            } else {
                answer += (Integer.valueOf(str) * num);
            }
        }
        return answer;
    }
}