class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int ans=0;
        Set<Integer> s=map.keySet();
        for(Integer k:s){
            if(map.get(k)>n/2){
                ans= k;
            }
        }
        return ans;
    }
}