// class Solution {
//     public int[] successfulPairs(int[] spells, int[] potions, long success) {
//         int n=spells.length;
//         int[] pairs=new int[n];
//         int k=0;
//         for(int i=0;i<n;i++){
//             int c=0;
//             for(int j=0;j<potions.length;j++){
//                 long cal=spells[i]*potions[j];
//                 if(cal>=success){
//                     c++;
//                 }
//             }
//             pairs[k]=c;
//             k++;
//         }
//         return pairs;
//     }
// }

import java.util.*;

public class Solution {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            
            // Step 1: Calculate minimum required potion
            long required = (success + spell - 1) / spell;
            
            // Step 2: Find first potion >= required
            int index = binarySearch(potions, required);
            
            // Step 3: Count = total potions - index
            result[i] = m - index;
        }
        
        return result;
    }

    
    private static int binarySearch(int[] potions, long target) {
        int left = 0, right = potions.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}