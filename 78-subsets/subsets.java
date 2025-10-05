class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        // result.add(new ArrayList<>());

        // for(int num: nums){
        //     int size=result.size();
        //     for(int i=0;i<size;i++){
        //         List<Integer> sub=new ArrayList<>(result.get(i));
        //         sub.add(num);
        //         result.add(sub);
        //     }
        // }
        // return result;
        List<Integer> arr=new ArrayList<>();
        int index=0;
        solve(nums, arr, index, result);
        return result;
    }
    private static void solve(int[] nums, List<Integer> arr, int index, List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(arr));
            return;
        }
        //exclude
        solve(nums,arr,index+1,result);
        //include
        int num=nums[index];
        arr.add(num);
        solve(nums,arr,index+1, result);
        arr.remove(arr.size() - 1);

    }
}