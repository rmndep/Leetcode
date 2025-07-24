class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        uni(nums,new ArrayList<Integer>(), ans, used);
        return ans;
    }

    static void uni(int[] nums, List<Integer> path, List<List<Integer>> ans, boolean[] used){
        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if (used[i]) continue;
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            path.add(nums[i]);
            uni(nums,path,ans,used);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}