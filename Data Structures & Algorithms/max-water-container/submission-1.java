class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0, left = 0, right = heights.length - 1;
        while (left < right) {
            int volume = Math.min(heights[left], heights[right]) * (right - left);
            if (heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
            maxVolume = Math.max(maxVolume, volume);
        }
        return maxVolume;        
    }
}
