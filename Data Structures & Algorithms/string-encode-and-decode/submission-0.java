class Solution {

    private static final char DELIMETER = '#';
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for( String str : strs ){
            sb.append(str.length()).append(DELIMETER).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded_List = new ArrayList<>();

        int i = 0 ;
       while( i < str.length() ){
         int delimeter_pos = str.indexOf(DELIMETER , i );

        int length = Integer.parseInt(str.substring(i , delimeter_pos ));

        String s = str.substring(delimeter_pos + 1 , delimeter_pos + 1 + length );

        decoded_List.add(s);

        i = delimeter_pos + 1 + length;

       }
          return decoded_List;
    }
}
