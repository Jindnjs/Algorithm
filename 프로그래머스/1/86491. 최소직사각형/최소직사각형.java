class Solution {
    public int solution(int[][] sizes) {
        int max_row = 0;
        int max_col = 0;
        for (int [] sin : sizes){
            int row = sin[0];
            int col = sin[1];
            if(row < col){
                int tmp = row;
                row = col;
                col = tmp;
            }
            max_row = Math.max(max_row, row);
            max_col = Math.max(max_col, col);
        }
        return max_row*max_col;
    }
}