class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
       Map<String,List<String>> map = new HashMap<>();


       for( String str : strs ){
        int[] counts = new int[26];         
         for( char ch_array : str.toCharArray() ){
            counts[ch_array - 'a']++;
         }

          String word = Arrays.toString(counts);

          if( !map.containsKey(word) ){
             map.put( word , new ArrayList<>() );
          }

          map.get(word).add(str);

       }

        return new ArrayList<>(map.values());

    }
}