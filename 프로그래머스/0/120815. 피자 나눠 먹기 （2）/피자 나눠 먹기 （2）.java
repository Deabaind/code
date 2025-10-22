class Solution {
    public static int gcd(int a, int b) {
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int solution(int n) {
        int piece = 6;
        
        return n / gcd(piece, n);
    }
}