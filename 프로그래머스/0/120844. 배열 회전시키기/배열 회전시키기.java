class Solution {
    public int[] solution(int[] numbers, String direction) {
        int num = 0;
        int numSize = numbers.length;
        
        if (direction.startsWith("r")) {
            num = numbers[numSize - 1];
            System.arraycopy(numbers, 0, numbers, 1, numSize - 1);
            numbers[0] = num;
        } else {
            num = numbers[0];
            System.arraycopy(numbers, 1, numbers, 0, numSize - 1);
            numbers[numSize - 1] = num;
        }
        return numbers;
    }
}