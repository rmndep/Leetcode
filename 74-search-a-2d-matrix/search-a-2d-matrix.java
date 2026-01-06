class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        int low=0;
        int high=m*n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/n;
            int col=mid%n;

            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                low=mid+1;
            }else if(matrix[row][col]>target){
                high=mid-1;
            }
        }
        return false;
    }
}