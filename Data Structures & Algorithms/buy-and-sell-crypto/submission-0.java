class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int price : prices){
            if(min > price) min =price;
            else if(price - min > profit) profit = price -min ;
        }
        return profit;
        
    }
}
