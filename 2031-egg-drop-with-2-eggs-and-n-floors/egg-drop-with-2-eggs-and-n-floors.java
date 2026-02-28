class Solution {

    static int[][] memo;

    public int twoEggDrop(int n) {

        memo = new int[3][n + 1];   

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1;
            }
        }

        return solve(2, n);
    }

    int solve(int eggs, int floors) {

        if (floors == 0 || floors == 1)
            return floors;

        if (eggs == 1)
            return floors;

        if (memo[eggs][floors] != -1)
            return memo[eggs][floors];

        int min = Integer.MAX_VALUE;

        for (int k = 1; k <= floors; k++) {

            int breaks = solve(eggs - 1, k - 1);
            int survives = solve(eggs, floors - k);

            int worst = 1 + Math.max(breaks, survives);

            min = Math.min(min, worst);
        }

        memo[eggs][floors] = min;

        return min;
    }
}