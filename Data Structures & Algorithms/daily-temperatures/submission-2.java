class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> notWarmerYet = new ArrayDeque<>();
        int[] daysUntilWarmer = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!notWarmerYet.isEmpty() && temperatures[i] > temperatures[notWarmerYet.peek()]){
                int popped = notWarmerYet.pop();
                daysUntilWarmer[popped] = i - popped;
            }
            notWarmerYet.push(i);
        }
        return daysUntilWarmer;
    }
}
