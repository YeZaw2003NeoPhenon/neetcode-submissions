class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        int[] s_cnt = new int[26];

        int[] t_cnt = new int[26];

        for(int i = 0; i < s_arr.length; ++i){
            s_cnt[s_arr[i] - 'a']++;
            t_cnt[t_arr[i] - 'a']++;
        }
        
        int count = 0;
        for(int i = 0; i < 26; ++i){
            if(s_cnt[i] == t_cnt[i]){
                count++;
            }
        }

        return count == s_cnt.length;
    }
}