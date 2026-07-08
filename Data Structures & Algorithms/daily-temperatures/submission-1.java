class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> indices = new ArrayDeque<>();
        int[] daysUntilWarmer = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!indices.isEmpty() && temperatures[i] > temperatures[indices.peek()]){
                int popped = indices.pop();
                daysUntilWarmer[popped] = i - popped;
            }
            indices.push(i);
        }

        return daysUntilWarmer;
    }
}
