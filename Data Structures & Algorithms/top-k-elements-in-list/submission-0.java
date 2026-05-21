class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            if (!mp.containsKey(num)) {
                mp.put(num, 0);
            }
            mp.put(num, mp.get(num) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}
