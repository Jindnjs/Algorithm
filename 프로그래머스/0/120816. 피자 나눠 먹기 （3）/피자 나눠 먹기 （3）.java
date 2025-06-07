class Solution {
    public int solution(int slice, int n) {
        int answer = n/slice;
        if(n%slice == 0){
            return answer;
        }
        return answer+1;
    }
}