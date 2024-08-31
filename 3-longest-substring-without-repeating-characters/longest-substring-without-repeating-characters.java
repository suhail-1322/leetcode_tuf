class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = 1; 
            for (int j = i + 1; j < s.length(); j++) {
                if (!hasRepeatingCharacters(s, i, j)) {
                    c++; 
                } else {
                    break; 
                }
            }
            count = Math.max(count, c); 
        }
        return count;
    }
    private boolean hasRepeatingCharacters(String s, int start, int end) {
        for (int k = start; k < end; k++) {
            if (s.charAt(k) == s.charAt(end)) {
                return true; 
            }
        }
        return false; 
    }
}
