class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> pos = new TreeMap<>();
        Deque<Double> time = new ArrayDeque<>();
        int fleet = 1;

        for(int i = 0; i < position.length; i++){
            pos.put(position[i], speed[i]);
        }

        for(int p : pos.keySet()){
            double curPosition = p;
            double curSpeed = pos.get(p);
            time.push((target - curPosition) / curSpeed);
        }

        double fleetLeader = time.pop();
        while(!time.isEmpty()){
            double timeUntil = time.pop();

            if(fleetLeader < timeUntil){
                fleetLeader = timeUntil;
                fleet++;
            }
        }

        return fleet;
    }
}
