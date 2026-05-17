class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numSet.contains(nums[i])) {
                return true;
            }
            numSet.add(nums[i]);
            if (numSet.size() > k) {
                numSet.remove(nums[i - k]);
            }
        }
        return false;        
    }
}