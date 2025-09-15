class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // System.out.println(map);

        //  Integer[] keys = map.keySet().toArray(new Integer[0]);

        // Arrays.sort(keys, (a, b) -> map.get(b) - map.get(a));

        // int[] arr = new int[k];
        // for (int i = 0; i < k; i++) {
        //     arr[i] = keys[i];
        // }
        // return arr;

        Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int n : map.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }
}