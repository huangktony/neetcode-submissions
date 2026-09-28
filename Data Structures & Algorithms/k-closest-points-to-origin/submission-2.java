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

        int[][] res = new int[distance.size()][2];
        int i = 0;
        for(int[] point : distance){
            res[i] = point;
            i++;
        }

        return res;
    }
}
