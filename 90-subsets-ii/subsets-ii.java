class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        Arrays.sort(nums);
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }

    static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
       ans.add(new ArrayList<>(output));

       for(int i=index;i<nums.length;i++){
        if(i>index && nums[i]==nums[i-1]) continue;

        output.add(nums[i]);
        solve(nums,output,i+1,ans);
        output.remove(output.size()-1);
       }
    }
}