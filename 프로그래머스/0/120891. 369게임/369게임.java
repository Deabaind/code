import java.util.Set;

class Solution {
    public int solution(int order) {
        String orderStr = String.valueOf(order);
        Set<Character> targets = Set.of('3', '6', '9');
        int answer = 0;
        
        for (char c : orderStr.toCharArray()) {
            if (targets.contains(c)){
                answer++;
            }
        }
        
        return answer;
    }
}