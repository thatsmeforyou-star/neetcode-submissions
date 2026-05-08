class Solution {
    public boolean isPalindrome(String s) {
       int n = s.length();
        int left = 0;
        int right = n-1;
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!isAlphaNumeric(l)){
                left++;
                continue;
            }
            if(!isAlphaNumeric(r)){
                right--;
                continue;
            }
            if(isUpperCase(l)){
                l = (char)(l+32);
            }
            if(isUpperCase(r)){
                r = (char)(r+32);
            }
            if(l!=r) return false;
            left++;
            right--;
        }
        return true;
    }
    public boolean isAlphaNumeric(char c){
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }
    public boolean isUpperCase(char c){
        return (c >= 'A' && c <= 'Z');
    }
}
