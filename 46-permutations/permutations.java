class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] used= new boolean[nums.length];
        per(nums,new ArrayList<>(), ans,used);
        return ans;
    }
    static void per(int[] nums,List<Integer> path, List<List<Integer>> ans, boolean[] used){
        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i]=true;
            path.add(nums[i]);
            per(nums,path,ans,used);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}