class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Deque<Integer> shorter = new ArrayDeque<>();

        for(int i = 0; i < heights.length; i++){
            while(!shorter.isEmpty() && heights[i] < heights[shorter.peek()]){
                int index = shorter.pop();
                int leftEdge = 0;
                if(!shorter.isEmpty()){
                    leftEdge = shorter.peek() + 1; 
                } 
                int rightEdge = i - 1;

                max = Math.max(max, heights[index] * (rightEdge - leftEdge + 1));
            }

            shorter.push(i);
        }   

        while(!shorter.isEmpty()){
            int index = shorter.pop();
            int leftEdge = 0;
                if(!shorter.isEmpty()){
                   leftEdge = shorter.peek() + 1; 
                } 
                int rightEdge = heights.length-1;

                max = Math.max(max, heights[index] * (rightEdge - leftEdge + 1));
        }

        return max;
    }
}
