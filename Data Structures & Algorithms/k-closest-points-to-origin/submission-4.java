class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> distance = new PriorityQueue<>((a, b) -> {
            int distA = (a[0] * a[0]) + (a[1] * a[1]);
            int distB = (b[0] * b[0]) + (b[1] * b[1]);

            return distB - distA;
        });

        for(int i = 0; i < points.length; i++){
            int[] point = points[i];

            distance.offer(point);

            if(distance.size() > k){
                distance.poll();
            }
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            int[] curr = distance.poll();
            res[i][0] = curr[0];
            res[i][1] = curr[1];
        }

        return res;
    }
}
