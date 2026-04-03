class Solution {

        public int maxProfit(int[]prices){
            int minPrice = prices[0];
            int maxProfit = 0;

            for(int sell = 1; sell < prices.length; sell++){
                if(minPrice > prices[sell]){
                    minPrice = prices[sell];
                }
                maxProfit = Math.max(maxProfit, prices[sell] - minPrice);
            }

            return maxProfit;
        }

    // public int maxProfit(int[] prices) {
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for(int price : prices){
    //         if(price < minPrice){
    //             minPrice = price;
    //         }

    //         if(price - minPrice > maxProfit){
    //             maxProfit = price - minPrice;
    //         }
    //     }

    //     return maxProfit;
    // }
}