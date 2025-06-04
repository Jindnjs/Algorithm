import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: array){
            map.merge(i,1, (o, n) -> o+n );
        }
        int max = 0;
        int secans = 0;
        int ans=0;
        for (Map.Entry<Integer, Integer> a : map.entrySet()){
            if(max <= a.getValue()){
                secans = max;
                max = a.getValue();
                ans = a.getKey();
            }
        }
        if (max == secans){
            return -1;
        }
        return ans;
    }
}