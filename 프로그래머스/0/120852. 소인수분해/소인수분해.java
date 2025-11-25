import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        int s = 2;
        
        while (n != 1) {
            if (n % s == 0) {
                if (!answer.contains(s)) {
                    answer.add(s);
                }
                n /= s;
            } else {
                s++;
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}