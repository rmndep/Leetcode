class Solution {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        public Point(int x, int y){
            this.x=x;
            this.y=y;
            this.dist=x * x + y * y;
        }

        @Override
        public int compareTo(Point p2){
            return p2.dist - this.dist;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for (int[] p : points) {
            pq.add(new Point(p[0], p[1]));
            if (pq.size() > k) {
                pq.poll(); 
            }
        }
        int[][] res = new int[k][2];
        int i = 0;

        while (!pq.isEmpty()) {
            Point p = pq.poll();
            res[i][0] = p.x;
            res[i][1] = p.y;
            i++;
        }

        return res;
    }
}