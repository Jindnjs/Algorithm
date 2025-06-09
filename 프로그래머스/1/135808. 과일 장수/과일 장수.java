import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        if(score.length < m){
            return 0;
        }
        int answer = 0;
        Arrays.sort(score);
        for(int i= score.length - m; i>=0; i-=m){
            answer += score[i]*m;
        }
        return answer;
    }
}