class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> waiting = new ArrayDeque<>();
        int[] daysWaited = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!waiting.isEmpty() && temperatures[i] > temperatures[waiting.peek()]){
                int poppedIndex = waiting.pop();
                daysWaited[poppedIndex] = i - poppedIndex;
            }
            waiting.push(i);
        }

        return daysWaited;
    }
}
