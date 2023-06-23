class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;
        int len = s.length();
        
        while (right < len) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                max = Math.max(max, charSet.size());
                right++;
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}