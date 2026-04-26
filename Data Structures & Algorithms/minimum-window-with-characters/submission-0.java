class Solution {
    public String minWindow(String s, String t) {

        Map<Character,Integer> t_freq_map = new HashMap<>();

        for( char ch : t.toCharArray()){
            t_freq_map.put(ch , t_freq_map.getOrDefault( ch , 0 ) + 1 );
        }

        String minWindow = "";
        int minLength = Integer.MAX_VALUE;

        for( int i = 0 ; i < s.length() ; ++i ){
            for( int j = i ; j < s.length(); ++j ){
                
              if(containsAllStrs(i , j , s , t_freq_map )){
                    String currentStr = s.substring( i , j + 1 );
                    if(currentStr.length() < minLength){
                        minLength = currentStr.length();
                        minWindow = currentStr;
                    }
                }
            }
        }
        return minWindow;
    }
    public boolean containsAllStrs(int start , int end , String s , Map<Character,Integer> t_freq_map ){

         Map<Character,Integer> freq = new HashMap<>();

         for( int i = start ; i <= end ; ++i ){
            freq.put(s.charAt(i) , freq.getOrDefault(s.charAt(i) , 0 ) + 1 );
        }

        for( Map.Entry<Character,Integer> entry : t_freq_map.entrySet()){
            if( entry.getValue() > freq.getOrDefault(entry.getKey() , 0 )){
                return false;
            }
        }
        return true;
    }

}
