class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> actualOrder = new TreeMap<>();
        int fleets = 1;
        Deque<Double> time = new ArrayDeque<>();

        for(int i = 0; i < position.length; i++){
            actualOrder.put(position[i], speed[i]);
        }

        for(int pos : actualOrder.keySet()){
            double ithPosition = pos;
            double ithSpeed = actualOrder.get(pos);
            time.push((target - ithPosition)/ithSpeed);
        }

        double carInFrontTime = time.pop();
        while(!time.isEmpty()){
            if(time.peek() > carInFrontTime){
                fleets++;
                carInFrontTime = time.peek();
            }
            time.pop();
        }

        return fleets;
    }
}
