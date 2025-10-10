class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        helper(nums,new ArrayList<>(),result);
        return result;
    }

    public void helper(int[] nums, ArrayList<Integer> temp,List<List<Integer>> result){

        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }


        for(int num:nums){
            if(temp.contains(num)) continue;
            temp.add(num);
            helper(nums,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}