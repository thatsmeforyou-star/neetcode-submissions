class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() < 2 || s.isBlank()) {
            return true;
        }
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String finalStr = sb.toString();
        int i = 0, j = finalStr.length() - 1;
        while (i < j) {
            if (finalStr.charAt(i) != finalStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;         
    }
}
