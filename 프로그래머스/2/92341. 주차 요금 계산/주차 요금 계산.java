import java.util.*;
class Solution {
    public static int calc(int[] fees, int time){
        if (time <= fees[0]){return fees[1];}

        int a = time - fees[0];
        a = (int)Math.ceil((double)a / fees[2]);
        return fees[1]+a*fees[3];
    }
    public int[] solution(int[] fees, String[] records) {
        String [] a ;
        Map<String, Integer> comp = new HashMap<>();
        Map<String, Integer> res = new HashMap<>();

        for (String i : records){
            a = i.split(" ");

            if(a[2].equals("IN")){
                String [] tmp = a[0].split(":");
                int time = Integer.parseInt(tmp[0])*60+Integer.parseInt(tmp[1]);
                comp.put(a[1], time);
                continue;
            }
            else{
                String [] tmp = a[0].split(":");
                int time = Integer.parseInt(tmp[0])*60+Integer.parseInt(tmp[1]);
                res.merge(a[1],time - comp.get(a[1]),Integer::sum);
                comp.remove(a[1]);
            }
        }
        comp.forEach((key,val) -> {
            res.merge(key,1439-val,Integer::sum);
        });
        return res.entrySet().stream().sorted(Map.Entry.comparingByKey()).mapToInt(entry -> calc(fees, entry.getValue())).toArray();
    }
}