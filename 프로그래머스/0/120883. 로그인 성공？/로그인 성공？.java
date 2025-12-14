import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String LOGIN_SUCCESS = "login";
        String LOGIN_WRONG_PW = "wrong pw";
        String LOGIN_FAIL = "fail";
        
        Map<String, String> users = new HashMap<>();
        
        for (String[] user : db) {
            users.put(user[0], user[1]);
        }
        
        if (users.containsKey(id_pw[0])) {
            if (users.get(id_pw[0]).equals(id_pw[1])) {
                return LOGIN_SUCCESS;
            } else {
                return LOGIN_WRONG_PW;
            }
        }
        return LOGIN_FAIL;
    }
}