class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSub = 0;

        for(int i = 0; i < s.length(); ++i){
           Set<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); ++j){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
            }
            maxSub = Math.max(maxSub, set.size());
        }
        return maxSub;
    }
}

/// sliding window? 
/// HashMap?