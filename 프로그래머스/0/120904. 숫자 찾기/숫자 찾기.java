class Solution {
    public int solution(int num, int k) {
        int count = -1;
        while (num >= 10) {
            if (num % 10 == k) count = 1;
            if (count > 0) count++;
            num /= 10;
        }
        if (num == k) count = 1;
        return count;
    }
}