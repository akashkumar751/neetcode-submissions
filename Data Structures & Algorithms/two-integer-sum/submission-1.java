class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums.length; j++) {
        //         if (i != j) {
        //             if (nums[i] + nums[j] == target) {
        //                 if (i < j) {
        //                     return new int[] {i, j};
        //                 } else {
        //                     return new int[] {j, i};
        //                 }
        //             }
        //         }
        //     }
        // }

        // return new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
