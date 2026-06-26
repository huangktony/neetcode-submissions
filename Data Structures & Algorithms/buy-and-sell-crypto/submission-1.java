class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int largestProfit = 0;

        while(right < prices.length){
            int currentLeft = prices[left];
            int currentRight = prices[right];
            if(currentRight < currentLeft){
                left = right;
            }
            else{
                largestProfit = Math.max(largestProfit, currentRight - currentLeft);
            }

            right++;
        }

        return largestProfit;
    }
}
