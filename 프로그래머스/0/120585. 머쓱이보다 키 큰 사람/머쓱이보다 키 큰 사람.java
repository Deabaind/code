class Solution {
    public int solution(int[] array, int height) {
        int tallCount = 0;
        for (int otherHeight : array) {
            if (height < otherHeight) {
                tallCount += 1;
            }
        }
        return tallCount;
    }
}