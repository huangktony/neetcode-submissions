class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> s = new ArrayDeque<>();

        for(int a : asteroids){
            boolean destroyed = false;
            while(!s.isEmpty() && (a < 0 && s.peek() > 0)){
                if(Math.abs(a) > s.peek()){
                    s.pop();
                    continue;
                } else if (Math.abs(a) == s.peek()){
                    s.pop();
                }

                destroyed = true;
                break;
            }

            if(!destroyed) s.push(a);
        }

        int[] res = new int[s.size()];
        int r = s.size() - 1;
        for(int i : s){
            res[r--] = i;
        }

        return res;
    }
}