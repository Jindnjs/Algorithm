class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;
        int gcd = gcd(denom, numer);
        if(gcd == 1){
            return new int []{numer,denom};
        }
        else{
            return new int []{numer/gcd,denom/gcd};
        }
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

