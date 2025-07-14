class Solution {
    public String findDifferentBinaryString(String[] nums) {
        char[] c=new char[nums.length];

        for(int i=0;i<nums.length;i++){
            c[i]=nums[i].charAt(i)=='0'?'1':'0';
        }
        return new String(c);
    }
}