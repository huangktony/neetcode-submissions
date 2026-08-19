class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> noWarmer = new ArrayDeque<>();
        int[] daysUntilWarm = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!noWarmer.isEmpty() && temperatures[i] > temperatures[noWarmer.peek()]){
                int day = noWarmer.pop();
                daysUntilWarm[day] = i - day;
            }

            noWarmer.push(i);
        }

        return daysUntilWarm;
    }
}
