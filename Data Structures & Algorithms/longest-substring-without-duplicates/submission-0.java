class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Set<Character> chars = new HashSet<>();
        int maxlength = 1, left = 0, right = 0;
        while (right < s.length()) {
            if (chars.contains(s.charAt(right))) {
                if (s.charAt(left) == s.charAt(right)) {
                    left++;
                    right++;
                } else {
                    chars.remove(s.charAt(left));
                    left++;

                }
            } else {
                chars.add(s.charAt(right));
                right++;
            }
            maxlength = Math.max(maxlength, right - left);
        }
        return maxlength;         
    }
}
