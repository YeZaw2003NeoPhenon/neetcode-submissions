class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] char_str1 = s1.toCharArray();
        Arrays.sort(char_str1);
        String sorted_str1 = new String(char_str1);

        for(int i = 0; i < s2.length(); ++i){
            for(int j = i; j < s2.length(); ++j){

                String substr = s2.substring(i, j + 1);
                char[] char_str2 = substr.toCharArray();

                Arrays.sort(char_str2);

               String sorted_str2 = new String(char_str2);

               if(sorted_str2.equals(sorted_str1)){
                  return true;
               }
            }
        }
        return false;
    }
}
