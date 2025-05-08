import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : tangerine){
            map.merge(i,1,Integer::sum);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int a=0;
        int ans=0;
        for (Map.Entry<Integer, Integer> i : list){
            a += i.getValue();
            ans ++;
            if(a >= k)
                break;
        }
        return ans;
    }
}