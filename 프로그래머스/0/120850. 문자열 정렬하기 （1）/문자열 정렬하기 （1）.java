import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
		String n = my_string.replaceAll("[^0-9]", "");
		int[] answer = new int[n.length()];

		for (int i = 0; i < n.length(); i++) {
			answer[i] = Integer.valueOf(n.substring(i, i + 1));
		}
        Arrays.sort(answer);
        return answer;
    }
}