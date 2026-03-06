class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        int fresh=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2) q.add(new int[]{i,j});
                if(grid[i][j]==1) fresh++;
            }
        }
        int ans=0;
        while(!q.isEmpty()&& fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
            int[] cell=q.poll();
            int r=cell[0];
            int c=cell[1];
            if(r-1>=0 && grid[r-1][c]==1){
                grid[r-1][c]=2;
                q.add(new int[]{r-1,c});
                fresh--;
            }
            if(r+1<rows && grid[r+1][c]==1){
                grid[r+1][c]=2;
                q.add(new int[]{r+1,c});
                fresh--;
            }
            if(c+1<cols && grid[r][c+1]==1){
                grid[r][c+1]=2;
                q.add(new int[]{r,c+1});
                fresh--;
            }

            if(c-1>=0 && grid[r][c-1]==1){
                grid[r][c-1]=2;
                q.add(new int[]{r,c-1});
                fresh--;
            }
            }  
            ans++;
        }
        if(fresh>0) return -1;
        return ans;
    }
}