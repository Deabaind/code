import java.util.List;
import java.util.ArrayList;

class Solution {
    public Long[] solution(int x, int n) {
        List<Long> array = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Long num = (long)x * i;
            array.add(num);
        }
        return array.toArray(new Long[array.size()]);
    }
}