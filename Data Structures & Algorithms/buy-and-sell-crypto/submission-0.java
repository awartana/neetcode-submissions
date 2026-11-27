class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int l=0;
        int maxprofit=0;
        int r=1;
        while(r<n){
            if(prices[l]<prices[r]){
                maxprofit=Math.max(maxprofit,(prices[r]-prices[l]));


            }
            else{
                l=r;
            }
            
           r++;
            
            
        }
        return maxprofit;

        
    }
}
