class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l=1;
        int r=*max_element(piles.begin(),piles.end());
        int k=l+r/2;
        while(l<r){
            k=l+(r-l)/2;
            int hours=0;
            for(int i=0;i<piles.size();i++){
                hours+=(piles[i]+k-1)/k;
            }
            if(hours<=h){
                r=k;
            }
            else{
                l=k+1;
            }
        }
        return l;
    }
};