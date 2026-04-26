class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
       Map<String,List<String>> map = new HashMap<>();


       for( String str : strs ){

        int[] counts = new int[26];   

        char[] char_array = str.toCharArray();

         for( char ch : char_array ){
            counts[ch - 'a']++;
         }

         // "eat" => ['e' , 'a' , 't']

          // String word = Arrays.toString(counts);

          String word = Arrays.toString(counts);

        //   if( !map.containsKey(word) ){
        //      map.put( word , new ArrayList<>() );
        //   }

        //   map.get(word).add(str);

        map.computeIfAbsent( word , k -> new ArrayList<>()).add(str);
        

       }

        return new ArrayList<>(map.values());

    }
}