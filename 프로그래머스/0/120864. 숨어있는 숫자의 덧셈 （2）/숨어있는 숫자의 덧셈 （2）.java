class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] numbers = my_string.split("\\D+");
        
        for (String number : numbers) {
            if (!number.isEmpty()) {
                answer += Integer.valueOf(number);
            }
        }
        
        return answer;
    }
}