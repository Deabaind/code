import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String[] morseArr = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, Character> morseMap = new HashMap<>();
        
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], (char)('a' + i));
        };
        
        StringBuilder answer = new StringBuilder();
        
        for (String m : morseArr) {
            answer.append(morseMap.get(m));
        };
        
        return answer.toString();
    }
}