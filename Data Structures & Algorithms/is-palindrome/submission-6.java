class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        char[] char_s = s.toCharArray();

        for(char ch : char_s){
            if(Character.isLetterOrDigit(ch)){
                char low_ch = Character.toLowerCase(ch);
                str.append(low_ch);
            }
        }

        return str.toString().equals(str.reverse().toString());

    }
}
