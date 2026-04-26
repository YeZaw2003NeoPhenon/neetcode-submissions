class Solution {
    public boolean isAnagram(String s, String t) {

        // Map<Character,Integer> sCounts = new HashMap<>();
        // Map<Character,Integer> tCounts = new HashMap<>();

        int[] countS = new int[26];
        int[] countT = new int[26];

        if( s.length() != t.length() ){
            return false;
        }

        if( s.length() == 0 || t.length() == 0 ) return false;

        for( int i = 0 ; i < s.length() ; ++i ){
            // sCounts.put(s.charAt(i) , sCounts.getOrDefault(s.charAt(i) , 0 ) + 1 );
            // tCounts.put(t.charAt(i) , tCounts.getOrDefault(t.charAt(i) , 0 ) + 1 );
            countS[s.charAt(i) - 'a']++;
            countT[t.charAt(i) - 'a']++;
        }


        for( int i = 0; i < 26 ; ++i ){
            if( countS[i] != countT[i]){
                return false;
            }

        }

        return true;

    }
}
