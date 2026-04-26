class Solution {
    public int characterReplacement(String s, int k) {
        

        Map<Character,Integer> map = new HashMap<>();
        int most_occur_freq = 0 ;
        int l = 0 ;
        int res = 0 ;
        for( int r = 0 ; r < s.length() ; ++r){
            char c = s.charAt(r);
          map.put( c , map.getOrDefault(c , 0 ) + 1 );
          most_occur_freq = Math.max( most_occur_freq , map.get(c) );

          if( (r - l + 1) - most_occur_freq > k ){

            map.put( s.charAt(l), map.get(s.charAt(l)) - 1 );
            
            l++;
          }
          res = Math.max(res , r - l + 1 );
        }
        return res;
    }
}
