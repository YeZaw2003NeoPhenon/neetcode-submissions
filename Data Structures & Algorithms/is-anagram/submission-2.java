class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> sCounts = new HashMap<>();
        Map<Character,Integer> tCounts = new HashMap<>();

        if( s.length() != t.length() ){
            return false;
        }
        if( s.length() == 0 || t.length() == 0 ) return false;
        
        for( int i = 0 ; i < s.length() ; ++i ){
            sCounts.put(s.charAt(i) , sCounts.getOrDefault(s.charAt(i) , 0 ) + 1 );
            tCounts.put(t.charAt(i) , tCounts.getOrDefault(t.charAt(i) , 0 ) + 1 );
        }

        for( char ch : sCounts.keySet() ){
            if(  sCounts.get(ch) != tCounts.get(ch) ){
                return false;
            }
        }

        return true;
    }
}
