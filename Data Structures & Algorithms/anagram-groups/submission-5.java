class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for( int i = 0 ; i < strs.length ; ++i ){
            List<String> list = new ArrayList<>();
            for( int j = 0 ; j < strs.length ; ++j ){
                if( isAnagram(strs[i] , strs[j] )){
                    list.add(strs[j]);
                }
            }
            if( !result.contains(list) ){
                result.add(list);
            }
        }
        return result;
    }
    public boolean isAnagram( String s1 , String s2 ){
        int[] count = new int[26];

        for( int i = 0 ; i < s1.length() ; ++i ){
            count[s1.charAt(i) -'a' ]++;
        }
        for( int i = 0 ; i < s2.length() ; ++i ){
             count[s2.charAt(i) -'a' ]--;
        }
        
        for( int co : count ){
            if( co != 0 ){
                return false;
            }
        }
        return true;
    }
}
