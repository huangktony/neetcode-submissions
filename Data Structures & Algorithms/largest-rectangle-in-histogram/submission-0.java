class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        Deque<Integer> stack = new ArrayDeque<>(); 

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int idx = stack.pop();                                  
                int left = stack.isEmpty() ? 0 : stack.peek() + 1;    
                int right = i - 1;                                    
                max = Math.max(max, heights[idx] * (right - left + 1));
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            int left = stack.isEmpty() ? 0 : stack.peek() + 1;
            int right = n - 1;
            max = Math.max(max, heights[idx] * (right - left + 1));
        }

        return max;
    }
}