class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int [Math.toIntExact(right - left + 1)];
        long ridx = left;
        for (int i=0; i<answer.length; i++) {
            int row = Math.toIntExact(ridx / n);
            int col = Math.toIntExact(ridx % n);
            answer[i] = Math.max(row,col) + 1;
            ridx++;
        }
        return answer;
    }
}