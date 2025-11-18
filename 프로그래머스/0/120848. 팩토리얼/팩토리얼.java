class Solution {
    public int solution(int n) {
        int product = 1;
        int count = 1;
        
        while (product <= n) {
            count++;
            product *= count;
        }
        return count - 1;
    }
}