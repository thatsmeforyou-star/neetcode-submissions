class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        Set<Character> chars = new HashSet<>();
        int maxlength = 0, left = 0, right = 0;
        while (right < s.length()) {
            while (chars.contains(s.charAt(right))) {
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
            right++;
        }
        return maxlength;       
    }
}
