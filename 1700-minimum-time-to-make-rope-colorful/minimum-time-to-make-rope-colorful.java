class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int totalTime = 0;
        
        int i = 0;
        while (i < n) {
            int sum = 0;
            int maxTime = 0;
            int j = i;

            while (j < n && colors.charAt(j) == colors.charAt(i)) {
                sum += neededTime[j];      
                maxTime = Math.max(maxTime, neededTime[j]); 
                j++;
            }
            totalTime += sum - maxTime;
            i = j;
        }

        return totalTime;
    }
}
