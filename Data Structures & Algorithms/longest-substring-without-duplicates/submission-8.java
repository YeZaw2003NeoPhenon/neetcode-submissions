class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;

        int maxSubLen = 0;

        Set<Character> set = new HashSet<>();

        while(r < s.length()){

            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxSubLen = Math.max(maxSubLen, r - l + 1);
            r++;
        }

        return maxSubLen;
    }
}

/// sliding window? 
/// HashMap?