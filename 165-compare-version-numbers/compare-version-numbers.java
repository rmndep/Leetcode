class Solution {
    public int compareVersion(String v1, String v2) {
        int i1=0,i2=0;
        int l1=v1.length();
        int l2=v2.length();

        while(i1<l1||i2<l2){
            int num1=0,num2=0;
             while (i1 < l1 && v1.charAt(i1) != '.'){
                num1=num1*10+(v1.charAt(i1++)-'0');
             }
              while (i2 < l2 && v2.charAt(i2) != '.'){
                num2=num2*10+(v2.charAt(i2++)-'0');
             }
             if(num1<num2){
                return -1;
             }else if(num1>num2){
                return 1;
             }
            i1++;
            i2++;
        }
        return 0;
    }
}