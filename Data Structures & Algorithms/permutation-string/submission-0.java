class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if( len1 > len2){
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowFreq = new int[26];

        for( int i = 0; i < len1 ; ++i ){
            s1Count[s1.charAt(i) -'a']++;
            windowFreq[s2.charAt(i)-'a']++;
        }

        for( int i = 0 ; i < len2 - len1 ; ++i ){
            if(isMatch(s1Count , windowFreq)){
                return true;
            }
            // if not match
            // remove first char and add up next one

             windowFreq[s2.charAt(i)-'a']--;
             windowFreq[s2.charAt(i + len1)-'a']++;
        }
        return isMatch(s1Count , windowFreq);
    }
    public boolean isMatch(int[] s1Count , int[] s2Count){
        for( int i = 0 ; i < 26 ; ++i ){
            if( s1Count[i] != s2Count[i] ){
                return false;
            }
        }
        return true;
    }
}