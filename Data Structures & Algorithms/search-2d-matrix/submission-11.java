class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m - 1;

        while(top <= bottom){

            int rowMid = (top + bottom)/2;

            if(matrix[rowMid][0] > target){
                bottom = rowMid - 1;
            } else if(matrix[rowMid][n-1] < target){
                top = rowMid + 1;
            } else break;
        }
        if(top > bottom) return false;

        int row = (top + bottom)/2;

        int left = 0;
        int right = n - 1;

        while (left <= right){
            int mid = (left + right)/2;

            if(matrix[row][mid] > target){
                right = mid - 1;
            } else if(matrix[row][mid] < target){
                left = mid + 1;
            } else return true;
        }
        
        return false;
    }
}
