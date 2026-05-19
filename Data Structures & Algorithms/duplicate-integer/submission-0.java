class Solution {
    // public boolean hasDuplicate(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         int count = 0;
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[j]==nums[i]){
    //                 count+=1;;
    //             }
    //         }
    //         if(count>1){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {
            if (hash.contains(num)) {
                return true;
            }
            hash.add(num);
        }
        return false;
    }
}