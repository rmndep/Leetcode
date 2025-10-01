class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkeble=0;
        while(numBottles>=numExchange){
            drinkeble+=numExchange;
            numBottles-=numExchange;
            numBottles++;
        }
        return drinkeble+numBottles;
    }
}