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

        int i = 0;
        List<String> decoded_list = new ArrayList<>();

        while( i < str.length() ){
            int delimeter_pos = str.indexOf('#',i);

            int len = Integer.parseInt(str.substring(i , delimeter_pos));

            String s = str.substring(delimeter_pos + 1 , delimeter_pos + 1 + len);

            decoded_list.add(s);

            i = delimeter_pos + 1 + len;
        }
        return decoded_list;
    }
}
