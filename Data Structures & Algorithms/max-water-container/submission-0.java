class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int largest = 0;

        while(left < right){
            int width = right-left;
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int lowestHeight = Math.min(leftHeight, rightHeight);
            largest = Math.max(largest, lowestHeight * width);
            if(leftHeight < rightHeight){
                left++;
            }
            else{
                right--;
            }

        }

        return largest;
    }
}
