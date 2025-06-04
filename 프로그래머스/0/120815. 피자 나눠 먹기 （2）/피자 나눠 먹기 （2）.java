class Solution {
    public int solution(int n) {
        
        return lcm(6,n)/6;
        
    }
    
    private int gcd(int a, int b){
        while(b != 0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    private int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}