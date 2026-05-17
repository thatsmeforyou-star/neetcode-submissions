class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i : nums)
        {
            if(duplicate.contains(i))
                return true;
            else
                duplicate.add(i);
        }
        return false;           
    }
}