class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            int max1 = pq.poll();
            int max2 = pq.poll();
            if (max1 != max2) {
                pq.add(max1 - max2);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
