class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Set<List<String>> res = new HashSet<>();

        for(int i = 0 ; i < strs.length; ++i){
            List<String> list = new ArrayList<>();
            for(int j = 0;j < strs.length; ++j){
                if(isAnagram(strs[i],strs[j])){
                    list.add(strs[j]);
                }
            }
            res.add(list);
        }
        return new ArrayList<>(res);
    }

    public boolean isAnagram(String s, String t){

        int[] s_cnt = new int[26];

        int[] t_cnt = new int[26];

        for(char ch : s.toCharArray()){
            s_cnt[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            t_cnt[ch - 'a']++;
        }

        for(int i = 0; i < 26; ++i){
            if(s_cnt[i] != t_cnt[i]){
                return false;
            }
        }
        
        return true;
    }
}
