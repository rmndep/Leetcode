class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            //top

            for (int j = sc; j <= ec; j++) {
                res.add(matrix[sr][j]);
            }

            //right
            for (int i = sr + 1; i <= er; i++) {
                res.add(matrix[i][ec]);
            }
            //bottom
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) {
                    res.add(matrix[er][j]);
                }
            }

            //left
            if (sc < ec) {
                for (int i = er - 1; i >= sr + 1; i--) {
                    res.add(matrix[i][sc]);
                }
            }

            sc++;
            sr++;
            ec--;
            er--;
        }
        return res;
    }
}