// class Solution {
//     public int uniquePaths(int m, int n) {
//         int i=0;
//         int j=0;

//         return count(m,n,i,j);
        
//     }
//     int count(int m,int n, int i,int j){
//         if(i==m-1 && j==n-1){
//             return 1;
//         }
//         if (i >= m || j >= n) {
//             return 0;
//         }
//         int way1=count(m,n,i+1,j);
//         int way2=count(m,n,i,j+1);

//         return way1+way2;
//     }
// }
class Solution {
    public int uniquePaths(int m, int n) {
        int N = m + n - 2;       // total moves
        int r = Math.min(m - 1, n - 1); // choose the smaller for efficiency
        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (N - r + i) / i;
        }

        return (int) result;
    }
}
