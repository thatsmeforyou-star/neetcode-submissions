class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        int longestSeq = 1;
        for (int num : numSet) {
            if (numSet.contains(num - 1))
                continue;
            else {
                int currentNum = num;
                int currentSeq = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSeq++;
                }
                longestSeq = Math.max(currentSeq, longestSeq);
            }
        }
        return longestSeq;      
    }
}
