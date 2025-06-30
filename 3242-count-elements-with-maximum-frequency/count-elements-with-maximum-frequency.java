class Solution {
    public int maxFrequencyElements(int[] nums) {
      
        int n = nums.length;
        int[] freq = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true; 
                }
            }
            freq[i] = count;
        }

        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && freq[i] == maxFreq) {
                total += freq[i];
            }
        }

        return total;
    }      
    }

