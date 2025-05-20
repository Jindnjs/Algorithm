import java.util.*;
class Solution {
    public boolean isPrime(long n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(long i=3;i<=Math.sqrt(n);i+=2)
            if(n%i==0) return false;
        return true;
    }
    public int solution(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.insert(0,n%k);
            n/=k;
        }
        String [] tmp = sb.toString().split("0");
        int ans = 0;
        for (String b : tmp){
            if(b.equals(""))
                continue;
            if(Long.parseLong(b)!=1)
                if(isPrime(Long.parseLong(b))) 
                    ans++;
        }
        return ans;
    }
}