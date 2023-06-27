int lengthOfLongestSubstring(char* s) {
    int charSet[256] = {0};
    int max = 0, left = 0, right = 0;

    while (s[right] != '\0') {
        if (charSet[s[right]] == 0) {
            charSet[s[right]] = 1;
            max = (right - left + 1) > max ? (right - left + 1) : max;
            right++;
        } else {
            charSet[s[left]] = 0;
            left++;
        }
    }
    return max;
}
