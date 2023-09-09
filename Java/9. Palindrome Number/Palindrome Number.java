class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        String numberStr = String.valueOf(x);  // int to Str
        int len = numberStr.length();
        
        if(len < 2)
            return true;

        for(int i = 0; i < len; i++) {
            if (numberStr.charAt(i) != (numberStr.charAt(len-i-1)))
                return false;
        }
        return true;
    }
}