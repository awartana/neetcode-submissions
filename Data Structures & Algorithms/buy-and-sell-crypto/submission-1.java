class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        /**int l=0;
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
        return maxprofit;**/

        int l=0;
        int minl=prices[l];
        int maxprofit=0;
        for(int i=1;i<n;i++){
            minl=Math.min(minl,prices[l]);
            int profit=prices[i]-minl;
            maxprofit=Math.max(maxprofit,profit);
             
             l++;

            }
            if(maxprofit<0){
                return 0;
            }
            return maxprofit;

        
    }
}
