class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int np = n / 10;
        answer += n * 12000;
        answer += (k - np) * 2000;
        return answer;
    }
}