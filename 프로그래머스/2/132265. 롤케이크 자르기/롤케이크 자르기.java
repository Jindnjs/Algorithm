import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> right = new HashMap<>();
        for (int k: topping){
            right.merge(k,1, Integer::sum);
        }
        Map<Integer, Integer> left = new HashMap<>();
        for (int key: topping){
            left.computeIfAbsent(key, k-> 1);
            right.computeIfPresent(key, (k,v)-> v > 1? v-1 : null);
            if(left.size()==right.size()){
                answer+=1;
            }
        }
        
        return answer;
    }
}