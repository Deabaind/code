class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        if (x % 1.0 == 0.0) {
            x = Math.pow(x + 1.0, 2);
            answer = (long) x;
        } else {
            answer = -1;
        }
        return answer;
    }
}