class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max_length = 0 ;

        for( int start = 0 ; start < s.length() ; ++start ){
            for( int end = start ; end < s.length() ; ++end ){
                 
                 if( hasUniqueCharacters(start , end , s )){
                    max_length = Math.max( max_length , end - start + 1 );
                }
            }
        }
        return max_length;
    }
    public boolean hasUniqueCharacters(int start , int end , String s ){
        HashSet<Character> set = new HashSet<>();

        for( int i = start ; i <= end ; ++i ){
            if( set.contains(s.charAt(i))){
                return false; // if duplicate tracked down
            }
            set.add(s.charAt(i));
        }
        return true; // if unique
    }
}
