class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars [right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}