class Solution {
    public int numberOfSteps(int num) {
        return step(num);
    }

    static int step(int num){
        return helper(num,0);
    }

    static int helper(int num, int count){
        if(num==0) return count;
        int ans=num%2;
        if(ans==0){
            return helper(num/2,count+1);
        }
        return helper(num-1,count+1);
    }
}