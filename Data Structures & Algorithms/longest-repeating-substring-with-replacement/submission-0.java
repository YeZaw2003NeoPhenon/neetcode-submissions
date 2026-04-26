class Solution {
    public int characterReplacement(String s, int k) {

        int max_length = 0;

        for( int i = 0 ; i < s.length() ; ++i ){
            for( int j = i ; j < s.length() ; ++j ){

                if(isChangeValid(i , j , s , k )){
                    max_length = Math.max(max_length , j - i + 1 );
                }
            }
        }
        return max_length;
    }
    public boolean isChangeValid(int start , int end , String s , int k ){
        Map<Character,Integer> map = new HashMap<>();

        int most_occur_freq = 0 ;

        for( int i = start ; i <= end ; ++i ){
            char c = s.charAt(i);
            map.put( c , map.getOrDefault(c , 0 ) + 1 );
            most_occur_freq = Math.max( most_occur_freq , map.get(c) );
        }
        int charsToReplace = ( end - start + 1 ) - most_occur_freq;
        return charsToReplace <= k ;
    }
}

 // Brute Force => ?? 
// generate all possible substrings with virtuous nasted for loop
// Count Character Frequencies
//Check Validity
// Track Maximum Length