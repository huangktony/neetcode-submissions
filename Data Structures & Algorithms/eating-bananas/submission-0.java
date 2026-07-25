class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int leftRate = 1;
        int rightRate = 0;
        int midRate = 0;
        for(int i = 0; i < piles.length; i++){
            rightRate = Math.max(rightRate, piles[i]);
        }

        while(leftRate < rightRate){
            midRate = leftRate + (rightRate - leftRate)/2;
            int tempHours = 0;
            for(int i = 0; i < piles.length; i++){
                tempHours += (piles[i] + midRate - 1) / midRate;            
            }
            if(tempHours > h){
                leftRate = midRate+1;
            } else{
                rightRate = midRate;
            }
        }

        return leftRate;
    }
}
