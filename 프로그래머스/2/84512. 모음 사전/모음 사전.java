import java.util.*;
class Solution {
    public int solution(String word) {
        int [] calced = {781, 156, 31, 6, 1};
        List<String> alpha = Arrays.asList("A", "E", "I", "O", "U");
        int res = 0;
        
        for (int i = 0; i < word.length(); i++){
            String k = String.valueOf(word.charAt(i));
            res += calced[i]*alpha.indexOf(k);
        }
        return res + word.length();
    }
}