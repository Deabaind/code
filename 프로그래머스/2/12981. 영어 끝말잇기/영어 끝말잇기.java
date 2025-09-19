class Solution {
    public static boolean check(String[] words, String w, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (words[i].equals(w)) return false;
        }
        return true;
    }
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 0;
        while (true) {
            if (cnt == 0) {
                cnt++;
            }
            if (!check(words, words[cnt], cnt)) {
                cnt++;
                break;
            }
            if (words[cnt - 1].charAt(words[cnt - 1].length() - 1) != words[cnt].charAt(0)) {
                cnt++;
                break;
            }
            cnt++;
            if (words.length == cnt) {
                answer[0] = 0;
                answer[1] = 0;
                cnt++;
                break;
            }
        }
        if (words.length >= cnt) {
            if (cnt % n != 0) {
                answer[0] = cnt % n;
            } else {
                answer[0] = n;
            }
            answer[1] = cnt / n;
            if (cnt % n != 0) answer[1] = (cnt /n) + 1;
        }
        return answer;
    }
}