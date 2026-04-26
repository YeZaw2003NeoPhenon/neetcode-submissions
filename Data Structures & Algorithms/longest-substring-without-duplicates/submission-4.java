class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> lastIndexPos = new HashMap<>(); // key => val  
        int left = 0;                                              // char => index
        int max_length = 0 ;

        int right = 0 ;

        while( right < s.length() ){

            if(lastIndexPos.containsKey(s.charAt(right)) && lastIndexPos.get(s.charAt(right)) >= left ){
                left = lastIndexPos.get(s.charAt(right)) + 1 ;
            }
            lastIndexPos.put(s.charAt(right), right);
            max_length = Math.max(max_length , right - left + 1 );
            right++;
        }
        return max_length;
    }
}
