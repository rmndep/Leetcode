class Solution {
    class Pair implements Comparable<Pair>{
        int diff;
        int val;
        Pair(int d, int v){
            diff=d;
            val=v;
        }

        public int compareTo(Pair p2){
             if (this.diff == p2.diff) {
                return this.val - p2.val;
            }
            return this.diff- p2.diff;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.reverseOrder());
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            pq.add(new Pair(Math.abs(x-arr[i]), arr[i]));
            if(pq.size()>k){
            pq.poll();
        }
        }
        

        while(!pq.isEmpty()){
            list.add(pq.poll().val);
        }
        Collections.sort(list);
        return list;
    }
}