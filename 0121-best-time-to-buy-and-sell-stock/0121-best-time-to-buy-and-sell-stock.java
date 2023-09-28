class Solution {
    public int maxProfit(int[] prices) {
        // int buy=Integer.MAX_VALUE;
        // int max=0;
        // for(int i=0;i<prices.length;i++){
        //     if(buy<prices[i]){
        //         int profit=prices[i]-buy;
        //         max=Math.max(profit,max);
        //     }else{
        //         buy=prices[i];
        //     }
        // }return max;

        int mini=prices[0],cost=0,profit=0;
        for(int i=1;i<=prices.length-1;i++){
            cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);

        }return profit;

        
    }
}